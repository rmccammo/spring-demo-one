package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {

	
	String[] fortunes = {"Today is your lucky day", "Today is your unlucky day",
			"Today is a day of average luck"};
	@Override
	public String getFortune() {
		int randIndex = (int) Math.floor(Math.random() * fortunes.length);
		
		return fortunes[randIndex];
	}
	


}
