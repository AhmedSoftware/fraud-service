	package com.ahmedsoftware.fraudservice;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
	
	
	@EnableBinding(Source.class)
@SpringBootApplication
public class FraudServiceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(FraudServiceApplication.class, args);
	}
		
		/*@Bean
		public ConnectionFactory connectionFactory() {
			CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
			connectionFactory.setHost("localhost");
			connectionFactory.setVirtualHost("localhost");
			connectionFactory.setUsername("admin");
			connectionFactory.setPassword("admin");
			return connectionFactory;
		}*/

}
