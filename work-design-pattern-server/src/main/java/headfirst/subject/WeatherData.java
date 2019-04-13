package headfirst.subject;

import java.util.ArrayList;

/**
 * @Auther: allanyang
 * @Date: 2019/4/13 13:14
 * @Description:
 */
public class WeatherData implements Subject {

    private ArrayList<headfirst.observer.Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(headfirst.observer.Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(headfirst.observer.Observer o) {
        int i = observers.indexOf(o);
        if (i > -1) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (headfirst.observer.Observer o :observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}