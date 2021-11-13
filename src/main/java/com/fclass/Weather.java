package com.fclass;



public class Weather {
    private int temp;
    private String precipitation;

    public void setTemp(int t){
        this.temp = t;
    }
    public void setPrecipitation(String p){
        this.precipitation = p;
    }
    public int getTemp(){
        return temp;
    }
    public String getPrecipitation(){
        return precipitation;
    }
}
