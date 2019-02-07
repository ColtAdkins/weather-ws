package com.manifestcorp.weather;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeatherStationImplTest {

  private WeatherStation station;

  @Before
  public void before() {
    station = new WeatherStationImpl("43085");
  }
  
  @Test
  public void testGetTempature() {
    assertTrue(station.getTemperature() > 0); 
  }

}
