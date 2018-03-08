package com.gushui.learning.spring.cloud.hystrix;

import com.netflix.hystrix.contrib.sample.stream.HystrixConfigSseServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableFeignClients
public class RestConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestConsumerFeignApplication.class, args);
    }

  public ServletRegistrationBean adminServletRegistrationBean() {
    return new ServletRegistrationBean(new HystrixConfigSseServlet(), "/hystrix.stream");
  }
}
