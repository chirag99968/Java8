package com.spring.learnspringframework.dependecyInjection.postPreConstruct;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
	}

	@PostConstruct
	public void intialize()
	{
		System.out.println("Calling method after injection");
		someDependency.getReady();
	}

	@PreDestroy
	public void destory()
	{
		System.out.println("Calling method after object destoryed");
		someDependency.getReady();
	}
}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("Dependency are injected");
	}
}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
}
