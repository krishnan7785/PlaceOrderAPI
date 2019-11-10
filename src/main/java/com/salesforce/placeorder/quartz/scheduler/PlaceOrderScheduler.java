package com.salesforce.placeorder.quartz.scheduler;

import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rabbitmq.client.ConnectionFactory;
import com.salesforce.placeorder.quartz.jobs.LoadContractAndOrdersJob;

public class PlaceOrderScheduler {
	final static Logger logger = LoggerFactory.getLogger(PlaceOrderScheduler.class);
    final static ConnectionFactory factory = new ConnectionFactory();
	public static void main() {
		try {
			factory.setUri(System.getenv("CLOUDAMQP_URL"));
	        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
	        scheduler.start();
	
	        JobDetail jobDetail = JobBuilder.newJob(LoadContractAndOrdersJob.class).build();
	        
	        Trigger trigger = TriggerBuilder.newTrigger()
	                .startNow()
	                .withSchedule(CronScheduleBuilder.cronSchedule("0/15 * * * * ?").withMisfireHandlingInstructionFireAndProceed())
	                .build();
	
	        scheduler.scheduleJob(jobDetail, trigger);
		} 
        catch (KeyManagementException | NoSuchAlgorithmException | URISyntaxException | SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}