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

    public Weather getWeather(String name){
       String query = "select * from city where name = ?";
       try {
           PreparedStatement st = con.prepareStatement(query);
           st.setString(1, name);
           ResultSet rs = st.executeQuery();
           while(rs.next()){
               Weather c1 = new Weather();
               c1.setCity(rs.getString(1));
               c1.setTemp(rs.getInt(2));
               c1.setPrecipitation(rs.getString(3));
               System.out.println("executing single city");
               return c1;
           }


       }catch(Exception e){
           e.getMessage();
       }

        return new Weather();//returning an empty weather object to avoid null pointer exception
    }

    public int createWeather(Weather city){

        try {
            String query = "Insert into city values(?,?,?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, city.getCity());
            st.setInt(2, city.getTemp());
            st.setString(3, city.getPrecipitation());

            int rowAffected = st.executeUpdate();
            return rowAffected;
        }catch(Exception e){
            e.getMessage();
        }
        return 0;

    }
    public int deleteWeather(String name){

        try {
            String query = "Delete from city where name = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, name);
            int rowAffected = st.executeUpdate();
//            System.out.println("rows deleted: " + rowAffected);
            return rowAffected;
        }catch(Exception e){
            e.getMessage();
        }
        return 0;

    }

}
