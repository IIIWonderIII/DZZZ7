import com.fasterxml.jackson.annotation.JsonProperty;

public class DegreeDaySummary{

	@JsonProperty("Cooling")
	private Cooling cooling;

	@JsonProperty("Heating")
	private Heating heating;

	public Cooling getCooling(){
		return cooling;
	}

	public Heating getHeating(){
		return heating;
	}
}
