package com.example.springdemo;

public class ScubaCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on diving";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
}
