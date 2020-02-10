package com.cts.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@EnableWebMvc
@ComponentScan(basePackages = "com.cts")
public class AppCofig extends WebMvcConfigurerAdapter{
	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver res=new InternalResourceViewResolver();
		res.setViewClass(JstlView.class);
		res.setPrefix("/WEB-INF/jsp/");
		res.setSuffix(".jsp");
		return res;
	}

}
