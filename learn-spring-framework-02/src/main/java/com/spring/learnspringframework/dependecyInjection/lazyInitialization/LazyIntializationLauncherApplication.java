package com.spring.learnspringframework.dependecyInjection.lazyInitialization;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Component
@Lazy
class ClassB {
	
	private ClassA classA;

	public ClassB(ClassA classA) {
		super();
		System.out.println("Intialization logic");
		this.classA = classA;
	}
	
	public void doSomething()
	{
		System.out.println("Do something with the bean");
	}
}

@Configuration
@ComponentScan
public class LazyIntializationLauncherApplication {
	
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(LazyIntializationLauncherApplication.class)) {
			System.out.println("Context info intialization completed");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			context.getBean(ClassB.class).doSomething();
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
