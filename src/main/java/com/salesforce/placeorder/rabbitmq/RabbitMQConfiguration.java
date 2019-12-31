package com.salesforce.placeorder.rabbitmq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.RabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class RabbitMQConfiguration {

	@Value("${spring.rabbitmq.queue}")
	String queueName;

	@Value("${spring.rabbitmq.exchange}")
	String exchange;
	
	@Bean
    public ConnectionFactory connectionFactory() {
        final URI ampqUrl;
        try {
            ampqUrl = new URI(getEnvironment("CLOUDAMQP_URL"));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        final CachingConnectionFactory factory = new CachingConnectionFactory();
        factory.setUsername(ampqUrl.getUserInfo().split(":")[0]);
        factory.setPassword(ampqUrl.getUserInfo().split(":")[1]);
        factory.setHost(ampqUrl.getHost());
        factory.setPort(ampqUrl.getPort());
        factory.setVirtualHost(ampqUrl.getPath().substring(1));

        return factory;
    }
	
	@Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        template.setExchange(this.exchange);
        template.setConnectionFactory(connectionFactory());
        return template;
    }
	
	/*@Bean
	public RabbitMessageSender rabbitMessageSender() {
		RabbitMessageSender sender = new RabbitMessageSender(rabbitTemplate());
		return sender;
	}*/
	
	@Bean
    public AmqpAdmin amqpAdmin() {
		AmqpAdmin admin = new RabbitAdmin(connectionFactory());
        return admin;
    }

    @Bean
    public Queue queue() {
    	Map<String, Object> args = new HashMap<String, Object>();
    	String haPolicyValue = "all";
    	args.put("x-ha-policy", haPolicyValue);
    	args.put("x-max-length", 5000);
    	args.put("x-overflow", "reject-publish");
        return new Queue(this.queueName,true,false,false,args);
    }
    
    @Bean
	DirectExchange exchange() {
		return new DirectExchange(this.exchange,true,false);
	}
    
    @Bean
	Binding binding() {
		return BindingBuilder.bind(queue()).to(exchange()).with(this.queueName);
	}
    
    @Bean
    public RabbitListenerContainerFactory<SimpleMessageListenerContainer> prefetchRabbitListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setAcknowledgeMode(AcknowledgeMode.AUTO);
        factory.setMaxConcurrentConsumers(60);
        return factory;
    }
	
	private static String getEnvironment(String name) {
        final String env = System.getenv(name);
        if (env == null) {
            throw new IllegalStateException("Environment variable [" + name + "] is not set.");
        }
        return env;
    }
}
