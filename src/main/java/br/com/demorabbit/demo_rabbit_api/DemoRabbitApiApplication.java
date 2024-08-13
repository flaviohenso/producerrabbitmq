package br.com.demorabbit.demo_rabbit_api;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class DemoRabbitApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRabbitApiApplication.class, args);
	}

}
