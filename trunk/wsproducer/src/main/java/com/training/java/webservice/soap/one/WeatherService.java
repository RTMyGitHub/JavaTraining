package com.training.java.webservice.soap.one;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WeatherService
{
	@WebMethod
	String getWeather(String troy);
}
