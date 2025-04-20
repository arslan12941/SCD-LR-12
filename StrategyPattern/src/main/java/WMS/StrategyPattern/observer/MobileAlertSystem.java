package WMS.StrategyPattern.observer;

public class MobileAlertSystem implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("[MobileAlertSystem] Sending Alert: Temp " + temperature + "°C | Humidity " + humidity + "%");
    }
}
