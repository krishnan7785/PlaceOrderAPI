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
	private AmqpTemplate rabbitTemplate;
	
	@Value("${spring.rabbitmq.exchange}")
	private String exchange;
	
	
	@Value("${spring.rabbitmq.queue}")
	String queueName;
	
	@Autowired
	public RabbitMessageSender(AmqpTemplate template) {
		this.rabbitTemplate = template;
	}
	
	public void send(Message message) {
		try {
			log.debug("In message sender Before:convertandsend");
			rabbitTemplate.convertAndSend(queueName,message);
			log.debug("In message sender After:convertandsend");
		}
		catch(Exception ex) {
			log.error(ex.getMessage());
		}
	}
	
	public AmqpTemplate getRabbitTemplate() {
		return rabbitTemplate;
	}
	
	
	public void setRabbitTemplate(AmqpTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}
}
