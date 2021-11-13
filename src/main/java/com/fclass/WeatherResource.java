package com.fclass;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("weather")
public class WeatherResource {

    WeatherRepository repo = new WeatherRepository();

    @Produces(MediaType.APPLICATION_JSON)
   @GET
    public List<Weather> getWeather(){
        return repo.getWeatherList();
   }


   @POST
   @Path("create")
   public Weather createWeather(Weather city){

        repo.createWeather(city);
        return city;
   }
}
