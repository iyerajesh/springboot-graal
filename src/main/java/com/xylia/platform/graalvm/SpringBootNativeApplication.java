package com.xylia.platform.graalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class SpringBootNativeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootNativeApplication.class, args);
    }

}
