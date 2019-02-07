package com.cdyne.ws.weatherws;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeatherTest {
  @Test
  public void testCallingCDYNEReturnsResult() {
    Weather weatherService = new Weather();
    WeatherSoap weatherSoap = weatherService.getWeatherSoap();
    WeatherReturn weather = weatherSoap.getCityWeatherByZIP("43085");
    assertEquals("Columbus", weather.getCity());
  }

}
