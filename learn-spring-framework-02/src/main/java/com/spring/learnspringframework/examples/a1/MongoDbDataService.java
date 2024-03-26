package com.spring.learnspringframework.examples.a1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class MongoDbDataService implements DataService{

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {11,33,44,55,67};
	}

	
}
