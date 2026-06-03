package com.cfs.WeatherApp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current {
    private Integer lastUpdatedEpoch;
    private String lastUpdated;
    @JsonProperty("temp_c")
    private Double tempC;
    private Double tempF;
    private Integer isDay;
    private Condition condition;
    private Double windMph;
    private Double windKph;
    private Integer windDegree;
    private String windDir;
    private Integer pressureMb;
    private Double pressureIn;
    private Integer precipMm;
    private Integer precipIn;
    private Integer humidity;
    private Integer cloud;
    private Double feelslikeC;
    private Double feelslikeF;
    private Double windchillC;
    private Double windchillF;
    private Double heatindexC;
    private Double heatindexF;
    private Double dewpointC;
    private Double dewpointF;
    private Integer visKm;
    private Integer visMiles;
    private Double uv;
    private Double gustMph;
    private Integer gustKph;
    private Integer willItRain;
    private Integer chanceOfRain;
    private Integer willItSnow;
    private Integer chanceOfSnow;
    private Double shortRad;
    private Double diffRad;
    private Double dni;
    private Double gti;

    public Current(Integer lastUpdatedEpoch, String lastUpdated, Double tempC, Double tempF, Integer isDay, Condition condition, Double windMph, Double windKph, Integer windDegree, String windDir, Integer pressureMb, Double pressureIn, Integer precipMm, Integer precipIn, Integer humidity, Integer cloud, Double feelslikeC, Double feelslikeF, Double windchillC, Double windchillF, Double heatindexC, Double heatindexF, Double dewpointC, Double dewpointF, Integer visKm, Integer visMiles, Double uv, Double gustMph, Integer gustKph, Integer willItRain, Integer chanceOfRain, Integer willItSnow, Integer chanceOfSnow, Double shortRad, Double diffRad, Double dni, Double gti) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
        this.lastUpdated = lastUpdated;
        this.tempC = tempC;
        this.tempF = tempF;
        this.isDay = isDay;
        this.condition = condition;
        this.windMph = windMph;
        this.windKph = windKph;
        this.windDegree = windDegree;
        this.windDir = windDir;
        this.pressureMb = pressureMb;
        this.pressureIn = pressureIn;
        this.precipMm = precipMm;
        this.precipIn = precipIn;
        this.humidity = humidity;
        this.cloud = cloud;
        this.feelslikeC = feelslikeC;
        this.feelslikeF = feelslikeF;
        this.windchillC = windchillC;
        this.windchillF = windchillF;
        this.heatindexC = heatindexC;
        this.heatindexF = heatindexF;
        this.dewpointC = dewpointC;
        this.dewpointF = dewpointF;
        this.visKm = visKm;
        this.visMiles = visMiles;
        this.uv = uv;
        this.gustMph = gustMph;
        this.gustKph = gustKph;
        this.willItRain = willItRain;
        this.chanceOfRain = chanceOfRain;
        this.willItSnow = willItSnow;
        this.chanceOfSnow = chanceOfSnow;
        this.shortRad = shortRad;
        this.diffRad = diffRad;
        this.dni = dni;
        this.gti = gti;
    }

    public Integer getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    public void setLastUpdatedEpoch(Integer lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Double getTempC() {
        return tempC;
    }

    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    public Double getTempF() {
        return tempF;
    }

    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    public Integer getIsDay() {
        return isDay;
    }

    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Double getWindMph() {
        return windMph;
    }

    public void setWindMph(Double windMph) {
        this.windMph = windMph;
    }

    public Double getWindKph() {
        return windKph;
    }

    public void setWindKph(Double windKph) {
        this.windKph = windKph;
    }

    public Integer getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Integer getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(Integer pressureMb) {
        this.pressureMb = pressureMb;
    }

    public Double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(Double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public Integer getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(Integer precipMm) {
        this.precipMm = precipMm;
    }

    public Integer getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(Integer precipIn) {
        this.precipIn = precipIn;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCloud() {
        return cloud;
    }

    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    public Double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(Double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public Double getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(Double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public Double getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(Double windchillC) {
        this.windchillC = windchillC;
    }

    public Double getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(Double windchillF) {
        this.windchillF = windchillF;
    }

    public Double getHeatindexC() {
        return heatindexC;
    }

    public void setHeatindexC(Double heatindexC) {
        this.heatindexC = heatindexC;
    }

    public Double getHeatindexF() {
        return heatindexF;
    }

    public void setHeatindexF(Double heatindexF) {
        this.heatindexF = heatindexF;
    }

    public Double getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(Double dewpointC) {
        this.dewpointC = dewpointC;
    }

    public Double getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(Double dewpointF) {
        this.dewpointF = dewpointF;
    }

    public Integer getVisKm() {
        return visKm;
    }

    public void setVisKm(Integer visKm) {
        this.visKm = visKm;
    }

    public Integer getVisMiles() {
        return visMiles;
    }

    public void setVisMiles(Integer visMiles) {
        this.visMiles = visMiles;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
    }

    public Double getGustMph() {
        return gustMph;
    }

    public void setGustMph(Double gustMph) {
        this.gustMph = gustMph;
    }

    public Integer getGustKph() {
        return gustKph;
    }

    public void setGustKph(Integer gustKph) {
        this.gustKph = gustKph;
    }

    public Integer getWillItRain() {
        return willItRain;
    }

    public void setWillItRain(Integer willItRain) {
        this.willItRain = willItRain;
    }

    public Integer getChanceOfRain() {
        return chanceOfRain;
    }

    public void setChanceOfRain(Integer chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    public Integer getWillItSnow() {
        return willItSnow;
    }

    public void setWillItSnow(Integer willItSnow) {
        this.willItSnow = willItSnow;
    }

    public Integer getChanceOfSnow() {
        return chanceOfSnow;
    }

    public void setChanceOfSnow(Integer chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
    }

    public Double getShortRad() {
        return shortRad;
    }

    public void setShortRad(Double shortRad) {
        this.shortRad = shortRad;
    }

    public Double getDiffRad() {
        return diffRad;
    }

    public void setDiffRad(Double diffRad) {
        this.diffRad = diffRad;
    }

    public Double getDni() {
        return dni;
    }

    public void setDni(Double dni) {
        this.dni = dni;
    }

    public Double getGti() {
        return gti;
    }

    public void setGti(Double gti) {
        this.gti = gti;
    }
}
