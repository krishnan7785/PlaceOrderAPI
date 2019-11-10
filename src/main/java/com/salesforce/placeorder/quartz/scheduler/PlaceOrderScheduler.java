package com.salesforce.placeorder.quartz.scheduler;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.repeatSecondlyForever;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.rabbitmq.client.ConnectionFactory;
import com.salesforce.placeorder.quartz.jobs.LoadContractAndOrdersJob;

public class PlaceOrderScheduler {
	final static Logger logger = LoggerFactory.getLogger(PlaceOrderScheduler.class);
    final static ConnectionFactory factory = new ConnectionFactory();
	public static void main(String args[]) {
		try {
			factory.setUri(System.getenv("CLOUDAMQP_URL"));
	        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

	        scheduler.start();

	        JobDetail jobDetail = newJob(LoadContractAndOrdersJob.class).build();
	        
	        Trigger trigger = newTrigger()
	                .startNow()
	                .withSchedule(repeatSecondlyForever(5))
	                .build();

	        scheduler.scheduleJob(jobDetail, trigger);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage(),e);
		}
	}
}
