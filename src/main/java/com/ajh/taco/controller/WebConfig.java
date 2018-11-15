package com.ajh.taco.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer { // A controller that does nothing but forward the request to a view
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/test").setViewName("test");
	}
}
