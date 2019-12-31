package com.salesforce.placeorder.quartz;


import java.io.IOException;
import java.util.Properties;
 
import org.quartz.spi.JobFactory;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.quartz.CronTrigger;

import com.salesforce.placeorder.quartz.AutowiringSpringBeanJobFactory;
import lombok.extern.log4j.Log4j2;
@Log4j2
@Configuration
public class QuartzConfiguration {
    @Bean
    public JobFactory jobFactory(ApplicationContext applicationContext) {
    	AutowiringSpringBeanJobFactory jobFactory = new AutowiringSpringBeanJobFactory();
        jobFactory.setApplicationContext(applicationContext);
        return jobFactory;
    }
 
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(JobFactory jobFactory)
            throws IOException {
        SchedulerFactoryBean factory = new SchedulerFactoryBean();
        factory.setOverwriteExistingJobs(true);
        factory.setJobFactory(jobFactory);
        CronTrigger lcotrigger = loadContractAndOrdersTrigger().getObject();
        factory.setTriggers(lcotrigger);
        factory.setQuartzProperties(quartzProperties());
        log.debug("starting jobs....");
        return factory;
    }
    
    @Bean
    public CronTriggerFactoryBean loadContractAndOrdersTrigger() {
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setJobDetail(loadContractAndOrders().getObject());
        cronTriggerFactoryBean.setCronExpression("*/10 * * * * *");
        cronTriggerFactoryBean.setMisfireInstruction(CronTrigger.MISFIRE_INSTRUCTION_DO_NOTHING);
        return cronTriggerFactoryBean;
    }
    
    @Bean
    public JobDetailFactoryBean loadContractAndOrders() {
        JobDetailFactoryBean jobDetailFactory = new JobDetailFactoryBean();
        jobDetailFactory.setJobClass(LoadContractAndOrdersJob.class);
        jobDetailFactory.setDurability(true);
        return jobDetailFactory;
    }
    
 
    @Bean
    public Properties quartzProperties() throws IOException {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.setLocation(new ClassPathResource("quartz.properties"));
        Properties properties;
        try {
            propertiesFactoryBean.afterPropertiesSet();
            properties = propertiesFactoryBean.getObject();
        }
        catch (IOException e) {
            throw new RuntimeException("Unable to load quartz.properties", e);
        }
 
        return properties;
    }
}
