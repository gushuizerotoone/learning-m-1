package com.gushui.learning.spring.zuul;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan({ "com.gushui.learning.spring.zuul" })
public class ResourceServerWebConfig extends WebMvcConfigurerAdapter {

}
