package com.salesforce.placeorder.quartz;


import java.io.IOException;
import java.util.Properties;
 
import org.quartz.JobDetail;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.spi.JobFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;
import com.salesforce.placeorder.quartz.AutowiringSpringBeanJobFactory;
import com.salesforce.placeorder.quartz.LoadContractAndOrdersJob;
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
    public SchedulerFactoryBean schedulerFactoryBean(JobFactory jobFactory, Trigger loadContractsAndOrdersTrigger)
            throws IOException {
        SchedulerFactoryBean factory = new SchedulerFactoryBean();
        factory.setJobFactory(jobFactory);
        factory.setQuartzProperties(quartzProperties());
        factory.setTriggers(loadContractsAndOrdersTrigger);
        log.info("starting jobs....");
        return factory;
    }
 
    @Bean
    public SimpleTriggerFactoryBean loadContractsAndOrdersTrigger(@Qualifier("loadContractsAndOrdersDetail") JobDetail jobDetail,
            @Value("${loadContractsAndOrdersWorker.frequency}") long frequency) {
        log.info("LoadContractsAndOrdersWorkerTrigger");
 
        SimpleTriggerFactoryBean factoryBean = new SimpleTriggerFactoryBean();
        factoryBean.setJobDetail(jobDetail);
        factoryBean.setStartDelay(0L);
        factoryBean.setRepeatInterval(frequency);
        factoryBean.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
        return factoryBean;
    }
 
    @Bean
    public Properties quartzProperties() throws IOException {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.setLocation(new ClassPathResource("/quartz.properties"));
        propertiesFactoryBean.afterPropertiesSet();
        return propertiesFactoryBean.getObject();
    }
 
    @Bean
    public JobDetailFactoryBean loadContractsAndOrdersDetail() {
        JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
        factoryBean.setJobClass(LoadContractAndOrdersJob.class);
        factoryBean.setDurability(true);
        return factoryBean;
    }
}
