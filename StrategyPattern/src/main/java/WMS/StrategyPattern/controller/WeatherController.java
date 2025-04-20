package WMS.StrategyPattern.controller;

import WMS.StrategyPattern.observer.*;
import WMS.StrategyPattern.subject.WeatherStation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherStation station;

    public WeatherController(WeatherStation station) {
        this.station = station;
        // Register initial observers
        station.addObserver(new DigitalDisplay());
        station.addObserver(new StatisticsBoard());
        station.addObserver(new MobileAlertSystem());
    }

    @PostMapping("/update")
    public String updateWeather(@RequestParam float temperature, @RequestParam float humidity) {
        station.setMeasurements(temperature, humidity);
        return "Weather updated!";
    }

    @PostMapping("/add-news-channel")
    public String addNewsChannel() {
        station.addObserver(new NewsChannel());
        return "NewsChannel subscribed.";
    }
}
