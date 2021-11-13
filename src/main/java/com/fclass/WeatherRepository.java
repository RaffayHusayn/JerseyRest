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
       ca.setCity("california");
       ca.setTemp(44);
       ca.setPrecipitation("high");

       Weather karachi = new Weather();
        karachi.setCity("karachi");
        karachi.setTemp(94);
        karachi.setPrecipitation("medium");

       weatherList.add(ny);
       weatherList.add(ca);
       weatherList.add(karachi);

    }


    public List<Weather> getWeatherList(){
        return weatherList;
    }

    public Weather getWeather(String name){
        for(Weather city: weatherList){
            if(city.getCity().equals(name)){
                return city;
            }
        }
        return null;
    }

    public Weather createWeather(Weather city){
        weatherList.add(city);
        System.out.println(weatherList.get(weatherList.size()-1));
        return city;
    }

}
