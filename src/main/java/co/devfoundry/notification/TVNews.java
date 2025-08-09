package co.devfoundry.notification;
import co.devfoundry.weather.Weather;

public class TVNews implements Observer {
    public void updateForecast(Weather weather){
        System.out.println("Telewizja - nowa prognoza pogody: temperatura: " + weather.getTemperature() + " stopni " +
                "oraz ciśnienie " + weather.getPressure() + " hPa");
    }
}
