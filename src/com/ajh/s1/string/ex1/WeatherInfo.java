package com.ajh.s1.string.ex1;

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

	public WeatherDTO[] makeWeather() {

		info = sb.toString();
		String[] strings = info.split(",");
		WeatherDTO[] weatherDTOs = new WeatherDTO[strings.length / 4];

		for (int i = 0; i < strings.length; i = i + 4) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(strings[i]);
			weatherDTO.setGion(strings[i + 1]);
			weatherDTO.setHum(strings[i + 2]);
			weatherDTO.setCondition(strings[i + 3]);

		}
	}
}