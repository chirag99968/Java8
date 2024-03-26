package com.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole{

	public void up()
	{
		System.out.println("Jump");
	}

	public void down()
	{
		System.out.println("Go in hole");
	}

	public void left()
	{
		System.out.println("Going back");
	}

	public void right()
	{
		System.out.println("Shoot it");
	}
}
