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
import com.salesforce.placeorder.quartz.scheduler.PlaceOrderScheduler.LoadContractAndOrdersJob.LoadOrderProductsExistingOrderJob;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PlaceOrderScheduler {

	final static Logger logger = LogManager.getLogger(PlaceOrderScheduler.class);

	public static void main(String args[]) {
		try {
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

	public static class LoadContractAndOrdersJob implements Job {

		@Override
		public void execute(JobExecutionContext context) throws JobExecutionException {
			// TODO Auto-generated method stub
			ClassPathXmlApplicationContext ctx = null;
			try {
				String msg = "LoadContractAndOrdersJob";
				ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
				RabbitTemplate rabbitTemplate = ctx.getBean(RabbitTemplate.class);
				while (true) {
					String sentimestamp = "Spring Sent at:" + System.currentTimeMillis();
					logger.debug(sentimestamp);
					logger.debug("\n------------------------------------------------------");
					logger.debug(msg);
					logger.debug("\n------------------------------------------------------");
					byte[] body = msg.getBytes("UTF-8");
					rabbitTemplate.send(new Message(body, new MessageProperties()));
				}
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
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

		public static class LoadOrderProductsExistingOrderJob implements Job {

			@Override
			public void execute(JobExecutionContext context) throws JobExecutionException {
				// TODO Auto-generated method stub
				ClassPathXmlApplicationContext ctx = null;
				try {
					String msg = "LoadOrderProductsExistingOrderJob";
					ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
					RabbitTemplate rabbitTemplate = ctx.getBean(RabbitTemplate.class);
					while (true) {
						String sentimestamp = "Spring Sent at:" + System.currentTimeMillis();
						logger.debug(sentimestamp);
						logger.debug("\n------------------------------------------------------");
						logger.debug(msg);
						logger.debug("\n------------------------------------------------------");
						byte[] body = msg.getBytes("UTF-8");
						rabbitTemplate.send(new Message(body, new MessageProperties()));
					}
				} catch (Exception e) {
					logger.error(e.getMessage(), e);
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
