package com.fclass;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("weather")
public class WeatherResource {

   @Produces(MediaType.APPLICATION_JSON)
   @GET
    public List<Weather> getWeather(){
        WeatherRepository repo = new WeatherRepository();
        return repo.getWeatherList();
   }
}
