import com.fasterxml.jackson.annotation.JsonProperty;

public class Moon{

	@JsonProperty("EpochSet")
	private int epochSet;

	@JsonProperty("Set")
	private String set;

	@JsonProperty("Phase")
	private String phase;

	@JsonProperty("EpochRise")
	private int epochRise;

	@JsonProperty("Age")
	private int age;

	@JsonProperty("Rise")
	private String rise;

	public int getEpochSet(){
		return epochSet;
	}

	public String getSet(){
		return set;
	}

	public String getPhase(){
		return phase;
	}

	public int getEpochRise(){
		return epochRise;
	}

	public int getAge(){
		return age;
	}

	public String getRise(){
		return rise;
	}
}
