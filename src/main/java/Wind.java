import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind{

	@JsonProperty("Speed")
	private Speed speed;

	@JsonProperty("Direction")
	private Direction direction;

	public Speed getSpeed(){
		return speed;
	}

	public Direction getDirection(){
		return direction;
	}
}
