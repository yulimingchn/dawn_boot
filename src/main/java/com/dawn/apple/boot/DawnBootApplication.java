package com.dawn.apple.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author dawnsyu
 */
@SpringBootApplication
@MapperScan("com.dawn.apple.boot.dao.mapper")
@ComponentScan(basePackages = {"com.dawn"})
@EnableDiscoveryClient
@EnableCircuitBreaker
public class DawnBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DawnBootApplication.class, args);
	}
}
