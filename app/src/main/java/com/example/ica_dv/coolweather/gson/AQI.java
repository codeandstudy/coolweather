package com.example.ica_dv.coolweather.gson;

/**
 * Created by ica_dv on 2018/3/11.
 */

public class AQI {

    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
