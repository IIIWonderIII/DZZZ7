import com.fasterxml.jackson.annotation.JsonProperty;

public class Heating{

	@JsonProperty("UnitType")
	private int unitType;

	@JsonProperty("Value")
	private double value;

	@JsonProperty("Unit")
	private String unit;

	public int getUnitType(){
		return unitType;
	}

	public double getValue(){
		return value;
	}

	public String getUnit(){
		return unit;
	}
}
