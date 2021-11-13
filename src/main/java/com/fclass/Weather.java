package com.fclass;


public class Weather {
    private int temp;
    private String city ;
    private String precipitation;

    public void setCity(String c){
        this.city = c;
    }
    public void setTemp(int t){
        this.temp = t;
    }
    public void setPrecipitation(String p){
        this.precipitation = p;
    }
    public String getCity(){
        return city;
    }
    public int getTemp(){
        return temp;
    }
    public String getPrecipitation(){
        return precipitation;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temp=" + temp +
                ", city='" + city + '\'' +
                ", precipitation='" + precipitation + '\'' +
                '}';
    }
}
