import com.fasterxml.jackson.annotation.JsonProperty;

public class WindGust{

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
