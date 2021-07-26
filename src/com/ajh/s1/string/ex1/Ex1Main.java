package com.ajh.s1.string.ex1;

public class Ex1Main {
	public static void main(String[] args) {
		// main은 프로그램 실행이나 테스트 역할

		// WeatherController wc = new WeatherController();
		// wc.start();

		WeatherInfo weatherInfo = new WeatherInfo();
		WeatherDTO[] weatherDTOs = weatherInfo.makeWeather();
		for (int i = 0; i < weatherDTOs.length; i++) {
			System.out.println(weatherDTOs[i].getCity());
			System.out.println(weatherDTOs[i].getGion());
			System.out.println(weatherDTOs[i].getHum());
			System.out.println(weatherDTOs[i].getCondition());
		}
	}

}
