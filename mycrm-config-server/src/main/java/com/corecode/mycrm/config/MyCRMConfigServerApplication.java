package com.corecode.mycrm.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyCRMConfigServerApplication {
	public static void main(String[] args) {
        SpringApplication.run(MyCRMConfigServerApplication.class, args);
    }


}