package com.coolweather.android.gson;

/**
 * Created by caiguoxin on 2017/2/15.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
