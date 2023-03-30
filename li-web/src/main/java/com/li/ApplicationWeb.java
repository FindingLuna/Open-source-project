package com.li;

import com.li.dao.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan(value = "com.li.dao")
public class ApplicationWeb {
    public static void main(String[] args) {
//        容器
        ConfigurableApplicationContext context = SpringApplication.run(ApplicationWeb.class, args);
    }
}