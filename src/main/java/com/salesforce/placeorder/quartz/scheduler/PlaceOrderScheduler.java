package com.salesforce.placeorder.quartz.scheduler;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.repeatSecondlyForever;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class PlaceOrderScheduler {
	final static Logger logger = LogManager.getLogger(PlaceOrderScheduler.class);
	private static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	public static void main(String args[]) {
		try {
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
			logger.error(e.getMessage(),e);
		}
	}
	
	public static class LoadContractAndOrdersJob implements Job {

		@Override
		public void execute(JobExecutionContext context) throws JobExecutionException {
			// TODO Auto-generated method stub
			try {
				String msg = "LoadContractAndOrdersJob";
		        RabbitTemplate rabbitTemplate = ctx.getBean(RabbitTemplate.class);
		        while(true){
		            String sentimestamp = "Spring Sent at:" + System.currentTimeMillis();
		            logger.debug(sentimestamp);
		            logger.debug("\n------------------------------------------------------");
		            logger.debug(msg);
		            logger.debug("\n------------------------------------------------------");
		            byte[] body = msg.getBytes("UTF-8");
		            rabbitTemplate.send(new Message(body, new MessageProperties()));
		        }
	        }
	        catch (Exception e) {
	            logger.error(e.getMessage(), e);
	        }
		}

	}
	
	public static class LoadOrderProductsExistingOrderJob implements Job {

		@Override
		public void execute(JobExecutionContext context) throws JobExecutionException {
			// TODO Auto-generated method stub
			try {
	            String msg = "LoadOrderProductsExistingOrderJob";
	            RabbitTemplate rabbitTemplate = ctx.getBean(RabbitTemplate.class);
		        while(true){
		            String sentimestamp = "Spring Sent at:" + System.currentTimeMillis();
		            logger.debug(sentimestamp);
		            logger.debug("\n------------------------------------------------------");
		            logger.debug(msg);
		            logger.debug("\n------------------------------------------------------");
		            byte[] body = msg.getBytes("UTF-8");
		            rabbitTemplate.send(new Message(body, new MessageProperties()));
		        }
	        }
	        catch (Exception e) {
	            logger.error(e.getMessage(), e);
	        }
		}

	}

}
