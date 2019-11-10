package com.salesforce.placeorder.quartz.jobs;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@DisallowConcurrentExecution
public class LoadContractAndOrdersJob implements Job {

	final static Logger logger = LoggerFactory.getLogger(LoadContractAndOrdersJob.class);
    final static ConnectionFactory factory = new ConnectionFactory();
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
            logger.info("Message Sent: " + msg);
            connection.close();
        }
        catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
	}

}
