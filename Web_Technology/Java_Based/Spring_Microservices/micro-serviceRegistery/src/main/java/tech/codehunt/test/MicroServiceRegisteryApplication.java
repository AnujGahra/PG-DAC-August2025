package tech.codehunt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServiceRegisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceRegisteryApplication.class, args);
	}

}
