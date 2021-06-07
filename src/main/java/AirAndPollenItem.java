import com.fasterxml.jackson.annotation.JsonProperty;

public class AirAndPollenItem{

	@JsonProperty("Category")
	private String category;

	@JsonProperty("Value")
	private int value;

	@JsonProperty("CategoryValue")
	private int categoryValue;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("Type")
	private String type;

	public String getCategory(){
		return category;
	}

	public int getValue(){
		return value;
	}

	public int getCategoryValue(){
		return categoryValue;
	}

	public String getName(){
		return name;
	}

	public String getType(){
		return type;
	}
}
