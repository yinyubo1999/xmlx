package com.shangma.cn;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.shangma.cn.mapper")
@EnableTransactionManagement
public class ProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class);
    }
//    @Bean
//    public ConfigurationCustomizer configurationCustomizer(){
//        return new ConfigurationCustomizer() {
//            @Override
//            public void customize(Configuration configuration) {
//                configuration.setMapUnderscoreToCamelCase(true);
//            }
//        };
//    }
}
