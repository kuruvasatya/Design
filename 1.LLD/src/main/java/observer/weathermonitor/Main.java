package observer.weathermonitor;

import observer.weathermonitor.display.CurrentConditionsDisplay;
import observer.weathermonitor.display.ForcastDisplay;

class Main {
    public static void main(String args[]) {
        WeatherData weatherData = new WeatherData();

        Display currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        Display forcastDisplay = new ForcastDisplay(weatherData);

        weatherData.setMeasurments(10f, 20f, 30f);

        weatherData.setMeasurments(90f,80f,60f);
    }
}
