package com.manifestcorp.weather;

public class Weather {
  private String city;
  private int temperature;

  public String getCity() {
    return city;
  }
  
  public void setCity(String city) {
    this.city = city;
  }
  
  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(String temperature) {
    this.temperature = Integer.parseInt(temperature);
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }
  
  
}
