package net.javaguides.springmvc.form.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "net.javaguides.springmvc.form" })
public class MVCConfig implements WebMvcConfigurer{

	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	// TODO
	//  Обработка исключения для модуля Customer.freePasses, но почему-то не работает :(
		//	@Bean
		//	public ResourceBundleViewResolver bundleViewResolver(){
		//		ResourceBundleViewResolver bundleViewResolver = new ResourceBundleViewResolver();
		//		bundleViewResolver.setBasename("resources/messages");
		//		return bundleViewResolver;
		//	}
}