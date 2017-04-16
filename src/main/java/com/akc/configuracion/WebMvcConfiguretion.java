package com.akc.configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.akc.component.RequestTimeInterceptor;

@Configuration
public class WebMvcConfiguretion extends WebMvcConfigurerAdapter{
/**
 * clase para capturar el tiempo de ejecucion 
 */
	@Autowired
	@Qualifier("requestTimeInterceptor")
	private RequestTimeInterceptor requestTimeInterceptor;
	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	registry.addInterceptor(requestTimeInterceptor);
	}

}
