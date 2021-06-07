import java.util.List;

public class Main {

    private static final String URL = "http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=EIPAAEugyKl9XVFTyluTlRgC4hemy7Mc&language=en-us&details=true&metric=true";

    public static void main(String[] args) {
        WeatherParser parser = new WeatherParser(URL);
        Weather weather = parser.getWeather();
        List<DailyForecastsItem> days = weather.getDailyForecasts();

        String[] weatherLinkParts = weather.getHeadline().getLink().split("/");

        for (DailyForecastsItem day : days) {
            System.out.println("В городе " + weatherLinkParts[5] + " на дату " + day.getDate() + " ожидает " + day.getDay().getIconPhrase() + ", температура - " + day.getTemperature().getMinimum().getValue() + day.getTemperature().getMinimum().getUnit() + " - " + day.getTemperature().getMaximum().getValue() + day.getTemperature().getMinimum().getUnit());
        }
    }

}
