import com.fasterxml.jackson.annotation.JsonProperty;

public class RealFeelTemperatureShade{

	@JsonProperty("Minimum")
	private Minimum minimum;

	@JsonProperty("Maximum")
	private Maximum maximum;

	public Minimum getMinimum(){
		return minimum;
	}

	public Maximum getMaximum(){
		return maximum;
	}
}
