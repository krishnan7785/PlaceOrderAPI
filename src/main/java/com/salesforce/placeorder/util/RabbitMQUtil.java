package com.salesforce.placeorder.util;

import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import com.rabbitmq.client.ConnectionFactory;

public class RabbitMQUtil {
	public static ConnectionFactory getConnectionFactory() throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException  {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUri(System.getenv("CLOUDAMQP_URL"));
        return factory;
    }
}
