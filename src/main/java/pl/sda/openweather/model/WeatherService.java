package pl.sda.openweather.model;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WeatherService {

    Location location;
    Current current;



    private String finalURL = "http://api.apixu.com/v1/current.json?key=a147a586068c46f2b4e90949191002&q=";



//    public WeatherService() {
//        try {
//            URL jsonURL = new URL("http://api.apixu.com/v1/current.json?key=a147a586068c46f2b4e90949191002&q=Paris");
//
//            ObjectMapper objectMapper = new ObjectMapper();
//            Weather weather = objectMapper.readValue(jsonURL, Weather.class);
//            System.out.println(weather);
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public WeatherService(String s, String klucz_api) {

    }

    public void getCityWeather(String city) {



        try {
            URL jsonURL = new URL(finalURL + city);

            ObjectMapper objectMapper = new ObjectMapper();
            Weather weather = objectMapper.readValue(jsonURL, Weather.class);
            System.out.println("Temperatura w: " + weather.getLocation().getName() + " to: " + weather.getCurrent().getTemp_c());


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}








