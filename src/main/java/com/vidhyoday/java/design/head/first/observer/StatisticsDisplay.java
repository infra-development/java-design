package com.vidhyoday.java.design.head.first.observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
    private ArrayList<Float> temperatures = new ArrayList<>();
    private ArrayList<Float> humidities = new ArrayList<>();
    private ArrayList<Float> pressures = new ArrayList<>();
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        List<Object> listOfParameters = computeStatistics();
        System.out.println("Mean Conditions: " +listOfParameters.get(0) + "F degrees " +
                "and " +listOfParameters.get(1) + "% humidity " +
                "and " + listOfParameters.get(2) + " pressure");
    }

    private List<Object> computeStatistics() {
        List<Object> listOfObjects = new ArrayList<>();
        float sumTemperature = 0;
        float sumHumidity = 0;
        float sumPressure = 0;

        for (Float temperature : temperatures) {
            sumTemperature += temperature;
        }
        for (Float humidity : humidities) {
            sumHumidity += humidity;
        }
        for (Float pressure : pressures) {
            sumPressure += pressure;
        }

        float meanTemperature = sumTemperature / temperatures.size();
        float meanHumidity = sumHumidity / humidities.size();
        float meanPressure = sumPressure / pressures.size();

        listOfObjects.add(meanTemperature);
        listOfObjects.add(meanHumidity);
        listOfObjects.add(meanPressure);

        return listOfObjects;
    }

    @Override
    public void update() {
        this.temperatures.add(weatherData.getTemperature());
        this.humidities.add(weatherData.getHumidity());
        this.pressures.add(weatherData.getPressure());
        display();
    }
}
