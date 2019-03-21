package com.defang.demoforcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
//@EnableCaching 注解 是为了spring-boot-starter-cache   jar包有用
@SpringBootApplication
public class DemoforcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoforcacheApplication.class, args);
    }

}
