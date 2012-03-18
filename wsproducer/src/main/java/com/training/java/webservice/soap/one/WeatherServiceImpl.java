package com.training.java.webservice.soap.one;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="com.training.java.webservice.soap.one.WeatherService")
public class WeatherServiceImpl implements WeatherService
{
	@Override
	@WebMethod
	public String getWeather(String troy)
	{
		return "rainy";
	}

}
