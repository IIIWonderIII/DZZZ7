import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WeatherParser {

    private final String url;
    private final ObjectMapper objectMapper;

    public WeatherParser(String url) {
        objectMapper = new ObjectMapper();
        this.url = url;
    }

//    public Weather getWeather() {
//        Weather weather = null;
//        try {
//            weather = objectMapper.readValue(new URL(url), Weather.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return weather;
//    }

    public Weather getWeather() {
        Weather weather = null;
        try {
            Request request = new Request.Builder()
                    .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=EIPAAEugyKl9XVFTyluTlRgC4hemy7Mc&language=en-us&details=true&metric=false")
                    .build();

            OkHttpClient client = new OkHttpClient();
            Call call = client.newCall(request);
            Response response = call.execute();
            String json = response.body().string();
            weather = objectMapper.readValue(json, Weather.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return weather;
    }

}
