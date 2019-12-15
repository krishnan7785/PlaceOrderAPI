package com.salesforce.placeorder.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import com.rabbitmq.client.ConnectionFactory;

public class RabbitMQUtil {
	public static ConnectionFactory getConnectionFactory() throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException  {
        ConnectionFactory factory = new ConnectionFactory();
        URI uri = new URI(System.getenv("CLOUDAMQP_URL"));
        factory.setUsername(uri.getUserInfo().split(":")[0]);
        factory.setPassword(uri.getUserInfo().split(":")[1]);
        factory.setHost(uri.getHost());
        factory.setPort(uri.getPort());
        factory.setVirtualHost(uri.getPath().substring(1));
        return factory;
    }
}
