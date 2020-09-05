package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.product.interceptor.AthorizeInterceptor;
import com.product.interceptor.ShareInterceptor;
@Configuration
public class InterceptorConfig implements WebMvcConfigurer{
	@Autowired
	ShareInterceptor share;
	@Autowired
	AthorizeInterceptor auth;
	@Override	
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(share).addPathPatterns("/**");	
		//kiem soat duong dan
		registry.addInterceptor(auth)
		.addPathPatterns("/account/change","/account/logoff","/account/edit","/order/**");
	}
}
