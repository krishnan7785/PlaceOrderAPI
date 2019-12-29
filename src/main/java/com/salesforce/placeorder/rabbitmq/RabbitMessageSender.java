package com.salesforce.placeorder.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
@Log4j2
@Service
public class RabbitMessageSender {
	@Autowired
	public AmqpTemplate rabbitTemplate;
	
	@Value("${spring.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${spring.rabbitmq.routingkey}")
	private String routingkey;
	
	public RabbitMessageSender(AmqpTemplate template) {
		this.rabbitTemplate = template;
	}
	
	public void send(Message message) {
		try {
			rabbitTemplate.send(exchange, routingkey, message);
		}
		catch(Exception ex) {
			log.error(ex.getMessage());
		}
	}
}
