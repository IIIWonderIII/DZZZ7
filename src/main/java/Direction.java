import com.fasterxml.jackson.annotation.JsonProperty;

public class Direction{

	@JsonProperty("English")
	private String english;

	@JsonProperty("Degrees")
	private int degrees;

	@JsonProperty("Localized")
	private String localized;

	public String getEnglish(){
		return english;
	}

	public int getDegrees(){
		return degrees;
	}

	public String getLocalized(){
		return localized;
	}
}
