package pl.sda.openweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweather.model.Weather;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        try {
            URL jsonURL = new URL("http://api.apixu.com/v1/current.json?key=a147a586068c46f2b4e90949191002&q=Paris");

                ObjectMapper objectMapper = new ObjectMapper();
                Weather weather = objectMapper.readValue(jsonURL, Weather.class);
                System.out.println(weather);

            } catch (IOException e) {
                e.printStackTrace();

            }

        }
    }

