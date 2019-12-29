package com.salesforce.placeorder.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.salesforce.placeorder"})
public class PlaceOrderScheduler {

	public static void main(String args[]) {
		try {
			SpringApplication.run(PlaceOrderScheduler.class, args);

			/*Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

			scheduler.start();

			JobDetail jobDetail1 = newJob(LoadContractAndOrdersJob.class).build();
			JobDetail jobDetail2 = newJob(LoadOrderProductsExistingOrderJob.class).build();
			Trigger trigger1 = newTrigger().startNow().withSchedule(repeatSecondlyForever(5)).build();
			Trigger trigger2 = newTrigger().startNow().withSchedule(repeatSecondlyForever(5)).build();

			scheduler.scheduleJob(jobDetail1, trigger1);
			scheduler.scheduleJob(jobDetail2, trigger2);*/

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
}
