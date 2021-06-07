import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Weather{

	@JsonProperty("Headline")
	private Headline headline;

	@JsonProperty("DailyForecasts")
	private List<DailyForecastsItem> dailyForecasts;

	public Headline getHeadline(){
		return headline;
	}

	public List<DailyForecastsItem> getDailyForecasts(){
		return dailyForecasts;
	}
}
