package com.cfs.WeatherApp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayTemp {
    private String date;

    @JsonProperty("maxtemp_c")
    private Double maxtemp;

    @JsonProperty("mintemp_c")
    private Double mintemp;

    @JsonProperty("avgtemp_c")
    private Double avgtemp;

    public DayTemp() {
    }

    public DayTemp(String date, Double maxtemp, Double mintemp, Double avgtemp) {
        this.date = date;
        this.maxtemp = maxtemp;
        this.mintemp = mintemp;
        this.avgtemp = avgtemp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getMaxtemp() {
        return maxtemp;
    }

    public void setMaxtemp(Double maxtemp) {
        this.maxtemp = maxtemp;
    }

    public Double getMintemp() {
        return mintemp;
    }

    public void setMintemp(Double mintemp) {
        this.mintemp = mintemp;
    }

    public Double getAvgtemp() {
        return avgtemp;
    }

    public void setAvgtemp(Double avgtemp) {
        this.avgtemp = avgtemp;
    }
}
