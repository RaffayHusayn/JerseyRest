package com.fclass;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("weather")
public class WeatherResource {

    WeatherRepository repo = new WeatherRepository();

    @Produces(MediaType.APPLICATION_JSON)
   @GET
    public List<Weather> getWeatherList(){
        return repo.getWeatherList();
   }

   @GET
   @Path("city/{name-param}")
    public Weather getWeather(@PathParam("name-param") String name){
       return repo.getWeather(name);
    }

   @POST
   @Path("create")
   public int createWeather(Weather city){

         int rowsAffected = repo.createWeather(city);
         return rowsAffected;
   }

   @DELETE
   @Path("delete/{name-param}")
   public int deleteWeather(@PathParam("name-param") String name){

        int rowsAffected = repo.deleteWeather(name);
        return rowsAffected;
   }
   @PUT
   @Path("update")
   public String updateWeather(Weather city){

        int rowsAffected = repo.updateWeather(city);
        if(rowsAffected == 0 ){ return "No changes made: probably the city that you are trying to update doesn't exist in the DB";}
        return "values update";
   }
}
