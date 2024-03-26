package com.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
	
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
		System.out.println("Going ahead");
	}

}
