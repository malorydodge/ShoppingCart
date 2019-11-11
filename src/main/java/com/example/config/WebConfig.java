package com.example.config;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.example.controllers")
public class WebConfig implements WebMvcConfigurer {

   @Override
   public void configureViewResolvers(ViewResolverRegistry registry) {
      registry.jsp("/WEB-INF/views/", ".jsp");
   }

   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {

      // Register resource handler for CSS and JS
      registry.addResourceHandler("/resources/**").addResourceLocations("/resources/static/")
            .setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES).cachePublic());

      // Register resource handler for images
      registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/")
            .setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES).cachePublic());
   }

@Override
public void addArgumentResolvers(List<HandlerMethodArgumentResolver> arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void addCorsMappings(CorsRegistry arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void addFormatters(FormatterRegistry arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void addInterceptors(InterceptorRegistry arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void addViewControllers(ViewControllerRegistry arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void configureAsyncSupport(AsyncSupportConfigurer arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void configureContentNegotiation(ContentNegotiationConfigurer arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void configureMessageConverters(List<HttpMessageConverter<?>> arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void configurePathMatch(PathMatchConfigurer arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void extendMessageConverters(List<HttpMessageConverter<?>> arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public MessageCodesResolver getMessageCodesResolver() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Validator getValidator() {
	// TODO Auto-generated method stub
	return null;
}
}