package org.ysfyrdmcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagementApplication.class);
    }
}