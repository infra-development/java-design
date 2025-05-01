package com.vidhyoday.java.design.head.first.observer;

public class WeatherStationSimulator {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(90, 75, 40.4f);
        weatherData.setMeasurements(100, 95, 60.4f);
        weatherData.removeObserver(currentDisplay);
        weatherData.removeObserver(statisticsDisplay);
    }

}
