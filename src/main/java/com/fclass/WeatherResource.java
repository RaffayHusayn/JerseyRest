package com.fclass;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("weather")
public class WeatherResource {

   @Produces(MediaType.APPLICATION_JSON)
   @GET
    public Weather getWeather(){

        Weather ny = new Weather();
        ny.setTemp(44);
        ny.setPrecipitation("high");
        return ny;
    }
}
