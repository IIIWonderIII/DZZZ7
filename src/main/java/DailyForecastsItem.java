import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DailyForecastsItem{

	@JsonProperty("Temperature")
	private Temperature temperature;

	@JsonProperty("Night")
	private Night night;

	@JsonProperty("EpochDate")
	private int epochDate;

	@JsonProperty("Moon")
	private Moon moon;

	@JsonProperty("DegreeDaySummary")
	private DegreeDaySummary degreeDaySummary;

	@JsonProperty("RealFeelTemperatureShade")
	private RealFeelTemperatureShade realFeelTemperatureShade;

	@JsonProperty("AirAndPollen")
	private List<AirAndPollenItem> airAndPollen;

	@JsonProperty("HoursOfSun")
	private double hoursOfSun;

	@JsonProperty("Sun")
	private Sun sun;

	@JsonProperty("Sources")
	private List<String> sources;

	@JsonProperty("Date")
	private String date;

	@JsonProperty("RealFeelTemperature")
	private RealFeelTemperature realFeelTemperature;

	@JsonProperty("Day")
	private Day day;

	@JsonProperty("Link")
	private String link;

	@JsonProperty("MobileLink")
	private String mobileLink;

	public Temperature getTemperature(){
		return temperature;
	}

	public Night getNight(){
		return night;
	}

	public int getEpochDate(){
		return epochDate;
	}

	public Moon getMoon(){
		return moon;
	}

	public DegreeDaySummary getDegreeDaySummary(){
		return degreeDaySummary;
	}

	public RealFeelTemperatureShade getRealFeelTemperatureShade(){
		return realFeelTemperatureShade;
	}

	public List<AirAndPollenItem> getAirAndPollen(){
		return airAndPollen;
	}

	public double getHoursOfSun(){
		return hoursOfSun;
	}

	public Sun getSun(){
		return sun;
	}

	public List<String> getSources(){
		return sources;
	}

	public String getDate(){
		return date;
	}

	public RealFeelTemperature getRealFeelTemperature(){
		return realFeelTemperature;
	}

	public Day getDay(){
		return day;
	}

	public String getLink(){
		return link;
	}

	public String getMobileLink(){
		return mobileLink;
	}
}
