package com.fclass;

import com.mysql.cj.protocol.Resultset;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;

public class WeatherRepository {


    Connection con;
    public WeatherRepository(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(Exception e){
            e.getMessage();
        }
       String url = "jdbc:mysql://localhost:3306/student";
       String username ="root";
       String password ="password";
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public List<Weather> getWeatherList(){
        List<Weather> weatherList = new ArrayList<>();
        String query = "select * from city";
        Statement st = null;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
               Weather c1 = new Weather();
               c1.setCity(rs.getString(1));
               c1.setTemp(rs.getInt(2));
               c1.setPrecipitation(rs.getString(3));
                System.out.println("fethcingajdkj;laksdjf;lkajsd;lkfdjsa");
               weatherList.add(c1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            return weatherList;
    }
//
//    public Weather getWeather(String name){
//        for(Weather city: weatherList){
//            if(city.getCity().equals(name)){
//                return city;
//            }
//        }
//        return null;
//    }
//
//    public Weather createWeather(Weather city){
//        weatherList.add(city);
//        System.out.println(weatherList.get(weatherList.size()-1));
//        return city;
//    }

}
