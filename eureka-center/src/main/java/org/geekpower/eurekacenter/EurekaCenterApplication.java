package org.geekpower.eurekacenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 服务注册中心配置
 * 
 * @author songyz
 * @createTime 2020-04-08 10:33:22
 */
@Slf4j
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableEurekaServer
public class EurekaCenterApplication {

    /**
     * 注册中心启动项
     * 
     * @param args
     */
    public static void main(String[] args) {
        log.info("=======》启动服务注册中心 eureka-center 服务项目ing......");
        SpringApplication.run(EurekaCenterApplication.class, args);
        log.info("=======》启动服务注册中心 eureka-center 服务项目成功......");
    }

    /**
     * 服务注册中心配置拦截
     * 
     * @author songyz
     * @createTime 2020-04-08 10:33:36
     */
    @EnableWebSecurity
    static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable();
        }
    }

}
