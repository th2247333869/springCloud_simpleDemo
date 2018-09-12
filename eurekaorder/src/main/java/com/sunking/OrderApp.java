package com.sunking;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderApp {

    public  static  void main(String[] args){
        SpringApplication.run(OrderApp.class,args);
    }

    @Bean
    @LoadBalanced//支持负载均衡
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
