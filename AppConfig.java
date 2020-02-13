package com.cts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

public class AppConfig {
	
	@Bean
	public ViewResolver vr() {
		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
		irvr.setViewClass(JstlView.class);
		irvr.setPrefix("/WEB-INF/jsp");
		irvr.setSuffix(".jsp");
		return irvr;
		
		
		
	}

}
