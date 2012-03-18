package com.training.java.webservice.soap.client.weather;

import com.training.java.webservice.soap.client.Weather;
import com.training.java.webservice.soap.client.WeatherReturn;
import com.training.java.webservice.soap.client.WeatherSoap;

public class WeatherServiceClient
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Weather service = new Weather();
		WeatherSoap port = service.getWeatherSoap();
		WeatherReturn weatherReturn = port.getCityWeatherByZIP("94035");
		String temperature = weatherReturn.getTemperature();
		
		System.out.println("Temperature = " + temperature);
		System.out.println("Description = " + weatherReturn.getDescription());
		System.out.println("Wind = " + weatherReturn.getWind());
		System.out.println("Pressure = " + weatherReturn.getPressure());
		System.out.println("Relative humidity = " + weatherReturn.getRelativeHumidity());
	}

}
