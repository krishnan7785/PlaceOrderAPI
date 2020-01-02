package com.salesforce.placeorder.quartz;

import org.quartz.JobDetail;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import com.salesforce.placeorder.quartz.LoadContractAndOrdersJob;
import com.salesforce.placeorder.quartz.QuartzConfiguration;
@Configuration
public class JobSubmitConfiguration {
    
	public static final String CRON_EVERY_FIVE_MINUTES = "0 0/5 * ? * * *";
    
    @Bean(name = "loadContractAndOrders")
    public JobDetailFactoryBean jobLoadContractAndOrders() {
        return QuartzConfiguration.createJobDetail(LoadContractAndOrdersJob.class, "Load Contract and Orders Job");
    }

    @Bean(name = "loadContractAndOrdersTrigger")
    public CronTriggerFactoryBean triggerLoadContractAndOrders(@Qualifier("loadContractAndOrders") JobDetail jobDetail) {
        return QuartzConfiguration.createCronTrigger(jobDetail, CRON_EVERY_FIVE_MINUTES, "Class Statistics Trigger");
    }
}
