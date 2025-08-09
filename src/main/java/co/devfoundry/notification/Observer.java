package co.devfoundry.notification;
import co.devfoundry.weather.Weather;
public interface Observer {
    void updateForecast(Weather weather);
}
