import com.fasterxml.jackson.annotation.JsonProperty;

public class Headline{

	@JsonProperty("Category")
	private String category;

	@JsonProperty("EndEpochDate")
	private Object endEpochDate;

	@JsonProperty("EffectiveEpochDate")
	private int effectiveEpochDate;

	@JsonProperty("Severity")
	private int severity;

	@JsonProperty("Text")
	private String text;

	@JsonProperty("EndDate")
	private Object endDate;

	@JsonProperty("Link")
	private String link;

	@JsonProperty("EffectiveDate")
	private String effectiveDate;

	@JsonProperty("MobileLink")
	private String mobileLink;

	public String getCategory(){
		return category;
	}

	public Object getEndEpochDate(){
		return endEpochDate;
	}

	public int getEffectiveEpochDate(){
		return effectiveEpochDate;
	}

	public int getSeverity(){
		return severity;
	}

	public String getText(){
		return text;
	}

	public Object getEndDate(){
		return endDate;
	}

	public String getLink(){
		return link;
	}

	public String getEffectiveDate(){
		return effectiveDate;
	}

	public String getMobileLink(){
		return mobileLink;
	}
}
