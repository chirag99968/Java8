package com.spring.learnspringframework.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan("com.spring.learnspringframework.game")
public class GamingAppLauncherApplication {
	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}	

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
