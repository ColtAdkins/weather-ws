package com.manifestcorp.weather;

import com.cdyne.ws.weatherws.WeatherReturn;
import com.cdyne.ws.weatherws.WeatherSoap;

public class WeatherStationImpl implements WeatherStation {
  
  static {
    com.cdyne.ws.weatherws.Weather weatherService = new com.cdyne.ws.weatherws.Weather();
    weatherSoap = weatherService.getWeatherSoap();
  }
  
  private static WeatherSoap weatherSoap;

  private String zipcode;

  public WeatherStationImpl(String zipcode) {
    this.zipcode = zipcode; 
  }

  @Override
  public int getTemperature() {
    return getWeather().getTemperature();
  }

  @Override
  public Weather getWeather() {
    WeatherReturn weatherReturn = weatherSoap.getCityWeatherByZIP(zipcode);
        
    Weather weather = new Weather();
    weather.setCity(weatherReturn.getCity());
    weather.setTemperature(weatherReturn.getTemperature());
    
    return weather;
  }

}
