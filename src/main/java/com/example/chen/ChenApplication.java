package com.example.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * SpringBootApplication 是SpringBoot启动类需要配置的注解，该注解融合了三个子注解：
 *   1、ComponentScan
 *   2、Configuration
 *   3、EnableAutoConfiguration
 */

@SpringBootApplication
@EnableEurekaServer
public class ChenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChenApplication.class, args);
	}
}
