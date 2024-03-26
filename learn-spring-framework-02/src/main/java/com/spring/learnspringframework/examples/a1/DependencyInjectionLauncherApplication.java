package com.spring.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {
	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}	

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		} catch (BeansException e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
	}
}
