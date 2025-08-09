package co.devfoundry;

import co.devfoundry.notification.InternetNews;
import co.devfoundry.notification.RadioNews;
import co.devfoundry.notification.TVNews;
import co.devfoundry.weather.Weather;

public class Main {

    public static void main(String[] args) {
        Weather weather = new Weather(25, 1003);

        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TVNews tvNews = new TVNews();

        weather.registerObserver(internetNews);
        weather.registerObserver(radioNews);
        weather.registerObserver(tvNews);

        weather.notifyObservers();

        weather.unregisterObserver(tvNews);
        weather.unregisterObserver(radioNews);
        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");
        weather.updateForecast(18, 1007);
    }

}
