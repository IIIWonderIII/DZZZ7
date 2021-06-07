import com.fasterxml.jackson.annotation.JsonProperty;

public class Sun{

	@JsonProperty("EpochSet")
	private int epochSet;

	@JsonProperty("Set")
	private String set;

	@JsonProperty("EpochRise")
	private int epochRise;

	@JsonProperty("Rise")
	private String rise;

	public int getEpochSet(){
		return epochSet;
	}

	public String getSet(){
		return set;
	}

	public int getEpochRise(){
		return epochRise;
	}

	public String getRise(){
		return rise;
	}
}
