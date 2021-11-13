package com.fclass;

import java.util.List;
import java.util.ArrayList;

public class WeatherRepository {
    List<Weather> weatherList;
    public WeatherRepository(){
       weatherList = new ArrayList<>();
       Weather ny = new Weather();
       ny.setCity("new york");
       ny.setTemp(44);
       ny.setPrecipitation("high");

       Weather ca = new Weather();
       ca.setCity("new york");
       ca.setTemp(44);
       ca.setPrecipitation("high");

       weatherList.add(ny);
       weatherList.add(ca);

    }


    public List<Weather> getWeatherList(){
        return weatherList;
    }

    public Weather createWeather(Weather city){
        weatherList.add(city);
        System.out.println(weatherList.get(weatherList.size()-1));
        return city;
    }

}
