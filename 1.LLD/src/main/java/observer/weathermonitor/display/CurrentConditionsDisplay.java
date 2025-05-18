package observer.weathermonitor.display;

import observer.weathermonitor.Display;
import observer.weathermonitor.Observer;
import observer.weathermonitor.WeatherData;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.pressure = weatherData.getPressure();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions:- \n---------------------------------------\nTemperature " + temperature +"\nPressure: " + pressure + "\nHumidity: "+humidity);
    }
}
