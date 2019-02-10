package pl.sda.openweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweather.model.Weather;
import pl.sda.openweather.model.WeatherService;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String a;

        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json", "KLUCZ API");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miejscowość: ");
        a = scanner.next();


        weatherService.getCityWeather(a);

        }
    }

