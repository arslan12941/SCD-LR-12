package WMS.StrategyPattern.observer;

public class NewsChannel implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("[NewsChannel] BREAKING WEATHER: Temp " + temperature + "°C, Humidity " + humidity + "%");
    }
}
