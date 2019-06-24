package org.me;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MyWebmvcConfigurer extends WebMvcConfigurerAdapter{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/home").setViewName("home");
        registry.addViewController("/login1").setViewName("loginMe");
        registry.addViewController("/403").setViewName("403");

	}
	
@Bean
  public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //viewResolver.setViewClass(JstlView.class);
        Logger myLog =Logger.getLogger(AppConfig.class);
        myLog.info("Creating view Resolver in Springbootapplication Config Class");
        viewResolver.setPrefix("/WEB-INF/views/jsp/");
        viewResolver.setSuffix(".jsp");
 
        return viewResolver;
    }
}
