package com.jackson.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient // 注解用来将当前应用加入到服务治理体系中。
public class EurekaConsumerApplication {

	@Bean
	public RestTemplate restTemplate() {// 用来真正发起REST请求。
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerApplication.class, args);
	}
}
