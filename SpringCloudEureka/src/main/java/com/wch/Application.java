package com.wch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2019年5月7日: 上午9:50:30
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
