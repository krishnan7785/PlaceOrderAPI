package com.salesforce.placeorder.quartz.scheduler;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.repeatSecondlyForever;
import static org.quartz.TriggerBuilder.newTrigger;

import java.util.HashMap;
import java.util.Map;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PlaceOrderScheduler {
    
	final static ConnectionFactory factory = new ConnectionFactory();
	public static void main(String args[]) {
		try {
			factory.setUri(System.getenv("CLOUDAMQP_URL"));
	        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

	        scheduler.start();

	        
	        JobDetail jobDetail1 = newJob(LoadContractAndOrdersJob.class).build();
	        JobDetail jobDetail2 = newJob(LoadOrderProductsExistingOrderJob.class).build();
	        Trigger trigger1 = newTrigger()
	                .startNow()
	                .withSchedule(repeatSecondlyForever(5))
	                .build();
	        Trigger trigger2 = newTrigger()
	                .startNow()
	                .withSchedule(repeatSecondlyForever(5))
	                .build();

	        scheduler.scheduleJob(jobDetail1, trigger1);
	        scheduler.scheduleJob(jobDetail2, trigger2);
	        
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage(),e);
		}
	}
	
	public static class LoadContractAndOrdersJob implements Job {

		@Override
		public void execute(JobExecutionContext context) throws JobExecutionException {
			// TODO Auto-generated method stub
			try {
	            Connection connection = factory.newConnection();
	            Channel channel = connection.createChannel();
	            String queueName = "work-queue-1";
	            Map<String, Object> params = new HashMap<String, Object>();
	            params.put("x-ha-policy", "all");
	            channel.queueDeclare(queueName, true, false, false, params);

	            String msg = "LoadContractAndOrdersJob";
	            byte[] body = msg.getBytes("UTF-8");
	            channel.basicPublish("", queueName, MessageProperties.PERSISTENT_TEXT_PLAIN, body);
	            log.info("Message Sent: " + msg);
	            connection.close();
	        }
	        catch (Exception e) {
	            log.error(e.getMessage(), e);
	        }
		}

	}
	
	public static class LoadOrderProductsExistingOrderJob implements Job {

		@Override
		public void execute(JobExecutionContext context) throws JobExecutionException {
			// TODO Auto-generated method stub
			try {
	            Connection connection = factory.newConnection();
	            Channel channel = connection.createChannel();
	            String queueName = "work-queue-1";
	            Map<String, Object> params = new HashMap<String, Object>();
	            params.put("x-ha-policy", "all");
	            channel.queueDeclare(queueName, true, false, false, params);

	            String msg = "LoadOrderProductsExistingOrderJob";
	            byte[] body = msg.getBytes("UTF-8");
	            channel.basicPublish("", queueName, MessageProperties.PERSISTENT_TEXT_PLAIN, body);
	            log.info("Message Sent: " + msg);
	            connection.close();
	        }
	        catch (Exception e) {
	            log.error(e.getMessage(), e);
	        }
		}

	}

}
