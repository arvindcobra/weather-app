package com.cfs.WeatherApp.Controller;

import com.cfs.WeatherApp.Service.weatherService;
import com.cfs.WeatherApp.dto.myWeatherForeCast;
import com.cfs.WeatherApp.dto.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/weather")
public class controller {

    @Autowired
    private weatherService service;

    @GetMapping("/{city}")
    public String getWeather(@PathVariable String city){
        return service.test();
    }

    @GetMapping("/my/{city}")
    public WeatherResponse getWeatherdata(@PathVariable String city){
        return service.getData(city);
    }
    @GetMapping("/forecast")
    public myWeatherForeCast getforcast(@RequestParam String city, @RequestParam Integer day){
        return service.getForeCast(city,day);
    }

}
