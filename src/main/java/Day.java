import com.fasterxml.jackson.annotation.JsonProperty;

public class Day{

	@JsonProperty("RainProbability")
	private int rainProbability;

	@JsonProperty("Wind")
	private Wind wind;

	@JsonProperty("SnowProbability")
	private int snowProbability;

	@JsonProperty("Snow")
	private Snow snow;

	@JsonProperty("TotalLiquid")
	private TotalLiquid totalLiquid;

	@JsonProperty("ShortPhrase")
	private String shortPhrase;

	@JsonProperty("Ice")
	private Ice ice;

	@JsonProperty("HoursOfRain")
	private double hoursOfRain;

	@JsonProperty("HoursOfIce")
	private double hoursOfIce;

	@JsonProperty("Rain")
	private Rain rain;

	@JsonProperty("PrecipitationProbability")
	private int precipitationProbability;

	@JsonProperty("HasPrecipitation")
	private boolean hasPrecipitation;

	@JsonProperty("ThunderstormProbability")
	private int thunderstormProbability;

	@JsonProperty("IceProbability")
	private int iceProbability;

	@JsonProperty("IconPhrase")
	private String iconPhrase;

	@JsonProperty("CloudCover")
	private int cloudCover;

	@JsonProperty("LongPhrase")
	private String longPhrase;

	@JsonProperty("Icon")
	private int icon;

	@JsonProperty("WindGust")
	private WindGust windGust;

	@JsonProperty("HoursOfSnow")
	private double hoursOfSnow;

	@JsonProperty("HoursOfPrecipitation")
	private double hoursOfPrecipitation;

	public int getRainProbability(){
		return rainProbability;
	}

	public Wind getWind(){
		return wind;
	}

	public int getSnowProbability(){
		return snowProbability;
	}

	public Snow getSnow(){
		return snow;
	}

	public TotalLiquid getTotalLiquid(){
		return totalLiquid;
	}

	public String getShortPhrase(){
		return shortPhrase;
	}

	public Ice getIce(){
		return ice;
	}

	public double getHoursOfRain(){
		return hoursOfRain;
	}

	public double getHoursOfIce(){
		return hoursOfIce;
	}

	public Rain getRain(){
		return rain;
	}

	public int getPrecipitationProbability(){
		return precipitationProbability;
	}

	public boolean isHasPrecipitation(){
		return hasPrecipitation;
	}

	public int getThunderstormProbability(){
		return thunderstormProbability;
	}

	public int getIceProbability(){
		return iceProbability;
	}

	public String getIconPhrase(){
		return iconPhrase;
	}

	public int getCloudCover(){
		return cloudCover;
	}

	public String getLongPhrase(){
		return longPhrase;
	}

	public int getIcon(){
		return icon;
	}

	public WindGust getWindGust(){
		return windGust;
	}

	public double getHoursOfSnow(){
		return hoursOfSnow;
	}

	public double getHoursOfPrecipitation(){
		return hoursOfPrecipitation;
	}
}
