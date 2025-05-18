package observer.weathermonitor.display;

import observer.weathermonitor.Display;
import observer.weathermonitor.Observer;
import observer.weathermonitor.WeatherData;

public class ForcastDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    public ForcastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        if(temperature > 30f && humidity > 50f) {
            System.out.println("Predicted to Rain ...");
        } else {
            System.out.println("No Rain Predicted...");
        }
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
