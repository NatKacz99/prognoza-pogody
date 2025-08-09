package co.devfoundry.notification;
import co.devfoundry.weather.Weather;

public class InternetNews implements Observer {
    public void updateForecast(Weather weather){
        System.out.println("Internet - nowa prognoza pogody: temperatura: " + weather.getTemperature() + " stopni " +
                "oraz ciśnienie " + weather.getPressure() + " hPa");
    }
}
