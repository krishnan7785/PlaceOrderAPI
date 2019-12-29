package com.salesforce.placeorder.quartz;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import com.salesforce.placeorder.quartz.PlaceOrderScheduler.LoadContractAndOrdersJob.LoadOrderProductsExistingOrderJob;
import com.salesforce.placeorder.rabbitmq.RabbitMessageSender;

import lombok.extern.log4j.Log4j2;

@Log4j2
@ComponentScan("com.salesforce.placeorder")
@SpringBootApplication
public class PlaceOrderScheduler {

	public static void main(String args[]) {
		try {
			SpringApplication.run(PlaceOrderScheduler.class, args);

			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

			scheduler.start();

			JobDetail jobDetail1 = newJob(LoadContractAndOrdersJob.class).build();
			JobDetail jobDetail2 = newJob(LoadOrderProductsExistingOrderJob.class).build();
			Trigger trigger1 = newTrigger().startNow().withSchedule(repeatSecondlyForever(5)).build();
			Trigger trigger2 = newTrigger().startNow().withSchedule(repeatSecondlyForever(5)).build();

			scheduler.scheduleJob(jobDetail1, trigger1);
			scheduler.scheduleJob(jobDetail2, trigger2);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage(), e);
		} finally {
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

	@Component
	public static class LoadContractAndOrdersJob implements Job {

		@Autowired
		RabbitMessageSender rabbitMessageSender;

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
					rabbitMessageSender.send(new Message(body, new MessageProperties()));
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

		@Component
		public static class LoadOrderProductsExistingOrderJob implements Job {

			@Autowired
			RabbitMessageSender rabbitMessageSender;

			@Override
			public void execute(JobExecutionContext context) throws JobExecutionException {
				try {
					String msg = "LoadOrderProductsExistingOrderJob";
					while (true) {
						String sentimestamp = "Spring Sent at:" + System.currentTimeMillis();
						log.debug(sentimestamp);
						log.debug("\n------------------------------------------------------");
						log.debug(msg);
						log.debug("\n------------------------------------------------------");
						byte[] body = msg.getBytes("UTF-8");
						rabbitMessageSender.send(new Message(body, new MessageProperties()));
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
	}
}
