package com.example.salah.simplelistviewexample;

import java.io.Serializable;

/**
 * Created by salah on 07/02/16.
 */
public class WeatherInfo implements Serializable {
    public static final WeatherInfo[] DummyWeatherInfo = new WeatherInfo[]{
            new WeatherInfo("1", "New York", "30", "11", "2", "80"),
            new WeatherInfo("2", "Boston", "32", "13", "12", "30")
    };
    private final String id;
    private final String name;
    private final String temp;
    private final String cloud;
    private final String wind;
    private final String rain;

    // Getters

    // Constructor
    public WeatherInfo(String id, String name, String temp, String cloud, String wind, String rain) {
        this.id = id;
        this.name = name;
        this.temp = temp;
        this.cloud = cloud;
        this.wind = wind;
        this.rain = rain;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTemp() {
        return temp;
    }

    public String getCloud() {
        return cloud;
    }

    public String getWind() {
        return wind;
    }

    public String getRain() {
        return rain;
    }
}
