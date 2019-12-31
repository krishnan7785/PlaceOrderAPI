package com.salesforce.placeorder.quartz;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesforce.placeorder.rabbitmq.RabbitMessageSender;

import lombok.extern.log4j.Log4j2;
@Log4j2
@Component
@DisallowConcurrentExecution
public class LoadContractAndOrdersJob implements Job {

	private RabbitMessageSender rabbitMessageSender;

	public RabbitMessageSender getRabbitMessageSender() {
		return rabbitMessageSender;
	}
	@Autowired
	public void setRabbitMessageSender(RabbitMessageSender rabbitMessageSender) {
		this.rabbitMessageSender = rabbitMessageSender;
	}

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		try {
			String msg = "LoadContractAndOrdersJob";
			while (true) {
				String sentimestamp = "Spring Sent at:" + System.currentTimeMillis();
				log.debug(sentimestamp);
				log.debug("\n------------------------------------------------------");
				log.debug(msg);
				log.debug("\n------------------------------------------------------");
				byte[] body = msg.getBytes("UTF-8");
				MessageProperties properties = new MessageProperties();
				properties.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN);
				properties.setDeliveryMode(MessageDeliveryMode.PERSISTENT);
				if(rabbitMessageSender!=null)
					rabbitMessageSender.send(new Message(body,properties));
				else
					throw new RuntimeException("Unable to instantiate rabbitMessage Sender");
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}finally {
			Runtime.getRuntime().addShutdownHook(new Thread() {
				@Override
				public void run() {
					final java.lang.management.ThreadMXBean threadMXBean = java.lang.management.ManagementFactory
							.getThreadMXBean();
					final java.lang.management.ThreadInfo[] threadInfos = threadMXBean
							.getThreadInfo(threadMXBean.getAllThreadIds(), 100);
					for (java.lang.management.ThreadInfo threadInfo : threadInfos) {
						if(threadInfo!=null) {
							log.debug(threadInfo.getThreadName());
							final Thread.State state = threadInfo.getThreadState();
							log.debug("   java.lang.Thread.State: " + state);
							final StackTraceElement[] stackTraceElements = threadInfo.getStackTrace();
							for (final StackTraceElement stackTraceElement : stackTraceElements) {
								log.debug("        at " + stackTraceElement);
							}
							log.debug("\n");
						}
					}
				}
			});
		}
	}
}
