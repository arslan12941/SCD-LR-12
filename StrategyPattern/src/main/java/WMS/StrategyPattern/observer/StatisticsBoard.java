package WMS.StrategyPattern.observer;

public class StatisticsBoard implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("[StatisticsBoard] Recorded Temp: " + temperature + " | Humidity: " + humidity);
    }
}