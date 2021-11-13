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

        Weather ny = new Weather();
        ny.setTemp(44);
        ny.setPrecipitation("high");
        Weather ca = new Weather();
        ca.setPrecipitation("low");
        ca.setTemp(70);
        List<Weather> weathers = Arrays.asList(ca, ny);
        return weathers;
    }
}
