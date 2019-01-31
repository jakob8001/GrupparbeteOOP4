import javafx.scene.paint.Color;

public class Volvo7402 extends Car {

	public final static double trimFactor = 1.25;


	public Volvo7402() {
		super(Color.RED, 100, "Volvo7402");
		stopEngine();
	}

	/**
	 * hur snabbt bilen acceleererar
	 */
	public double speedFactor() {
		return getEnginePower() * 0.01 * trimFactor;
	}
}
