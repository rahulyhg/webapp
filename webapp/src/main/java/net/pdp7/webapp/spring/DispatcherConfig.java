package net.pdp7.webapp.spring;

import net.pdp7.webapp.spring.web.WebAppController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
public class DispatcherConfig {
	
	@Autowired
	public AppConfig appConfig;
	
	@Bean
	public WebAppController webAppController() {
		return new WebAppController();
	}
	
	@Bean
	public ViewResolver viewResolver() {
		UrlBasedViewResolver urlBasedViewResolver = new UrlBasedViewResolver();
		urlBasedViewResolver.setSuffix(".jsp");
		urlBasedViewResolver.setPrefix("/WEB-INF/jsp/");
		urlBasedViewResolver.setViewClass(JstlView.class);
		return urlBasedViewResolver;
	}
}
