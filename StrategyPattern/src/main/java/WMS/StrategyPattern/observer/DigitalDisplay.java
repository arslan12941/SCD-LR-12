package WMS.StrategyPattern.observer;

public class DigitalDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("[DigitalDisplay] Temp: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}
