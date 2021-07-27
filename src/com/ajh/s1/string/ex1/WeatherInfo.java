package com.ajh.s1.string.ex1;

import java.util.Scanner;

public class WeatherInfo {

	private String info;
	private StringBuffer sb;

	public WeatherInfo() {
		sb = new StringBuffer();
		sb.append("seoul, 37, 80, 맑음,");
		sb.append("daegu, 43, 90, 지옥,");
		sb.append("busan, -32,10, 눈,");
		sb.append("jeju, 3, 40, 비");
	}

	// searchWeather
	// 도시명을 입력 받아서 전체정보에서 일치하는 도시를 찾아서 DTO 리턴

	public WeatherDTO searchWeather(WeatherDTO[] weathers) {

		Scanner sc = new Scanner(System.in);
		WeatherDTO weatherDTO = null;

		System.out.println("검색 할 도시명을 입력해주세요.");
		String cityName = sc.next();

		for (int i = 0; i < weathers.length; i++) {
			if (weathers[i].getCity().equals(cityName)) {
				weatherDTO = weathers[i];
				break;
			}
		}

		return weatherDTO;

	}

	public WeatherDTO[] makeWeather() {

		info = sb.toString();
		String[] strings = info.split(",");
		WeatherDTO[] weathers = new WeatherDTO[strings.length / 4];
		int j = -1;

		for (int i = 0; i < weathers.length; i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(strings[++j].trim());
			weatherDTO.setGion(strings[++j].trim());
			weatherDTO.setHum(strings[++j].trim());
			weatherDTO.setCondition(strings[++j].trim());
			weathers[i] = weatherDTO;
		}
		return weathers;
	}
}