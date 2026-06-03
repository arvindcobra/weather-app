package com.cfs.WeatherApp.Service;

import com.cfs.WeatherApp.dto.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class weatherService {
    @Value("${weather.api.url}")
    private String apiurl;

    @Value("${weather.api.key}")
    private String apikey;

    @Value("${weather.api.forecast.url}")
    private String apiforecasturl;

    private RestTemplate template=new RestTemplate();
    public String test(){
        return "good";
    }

    public WeatherResponse getData(String city){
        String url=apiurl+"$?key="+apikey+"&q="+city;
        RootClass response=template.getForObject(url,RootClass.class);
        WeatherResponse weatherresponse=new WeatherResponse();
        weatherresponse.setCity(response.getLocation().getName());
        weatherresponse.setRegion(response.getLocation().getRegion());
        weatherresponse.setCountry(response.getLocation().getCountry());
        String condition=response.getCurrent().getCondition().getText();
        weatherresponse.setCondition(condition);
        weatherresponse.setTemperature(response.getCurrent().getTempC());

        return weatherresponse;
    }
    public myWeatherForeCast getForeCast(String city, Integer day){
        myWeatherForeCast forecast=new myWeatherForeCast();
        WeatherResponse weatherResponse=getData(city);
        myWeatherForeCast response=new myWeatherForeCast();
        response.setWeatherResponse(weatherResponse);

        List<DayTemp> dayList=new ArrayList<>();

        String url=apiforecasturl+"$?key="+apikey+"&q="+city+"&days="+day;
        System.out.println(url);
        RootClass apiresponse=template.getForObject(url,RootClass.class);
        Forecast forecast1=apiresponse.getForecast();
        ArrayList<Forecastday> forecastdays= (ArrayList<Forecastday>) forecast1.getForecastday();
        for(Forecastday days: forecastdays){
            DayTemp dd=new DayTemp();
            dd.setDate(days.getDate());
            dd.setAvgtemp(days.getDay().getAvgtempC());
            dd.setMaxtemp(days.getDay().getMaxtempC());
            dd.setMintemp(days.getDay().getMintempC());
            dayList.add(dd);

        }
        response.setDayTemp(dayList);
        return response;


    }


}
