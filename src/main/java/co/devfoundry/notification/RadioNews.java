package co.devfoundry.notification;
import co.devfoundry.weather.Weather;

public class RadioNews implements Observer {
    public void updateForecast(Weather weather){
        System.out.println("Radio - nowa prognoza pogody: temperatura: " + weather.getTemperature() + " stopni " +
                "oraz ciśnienie " + weather.getPressure() + " hPa");
    }
}
