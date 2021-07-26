package com.ajh.s1.string.ex1;

import java.util.Scanner;

public class WeatherController {

	private WeatherInfo weatherInfo;

	public WeatherController() {
		weatherInfo = new WeatherInfo();
	}

	public void start() {

		System.out.println("Start");

		Scanner sc = new Scanner(System.in);

		boolean check = true;

		weatherInfo.makeWeather();

		while (check) {
			System.out.println("1. 날씨정보전체출력\t2. 지역검색정보출력\t3. 지역정보추가\t4. 프로그램 종료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("날씨정보전체출력");
			} else if (select == 2) {
				System.out.println("지역검색정보출력");
			} else if (select == 3) {
				System.out.println("지역정보추가");
			} else {
				break;
			}

		}
		System.out.println("Finish");

	}
}
