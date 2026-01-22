package tech.codehunt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "tech.codehunt.test.external.client")
@SpringBootApplication
@EnableEurekaClient
public class MicroPlotApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroPlotApplication.class, args);
	}

}
