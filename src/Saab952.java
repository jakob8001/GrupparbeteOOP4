import javafx.scene.paint.Color;

public class Saab952 extends Car {

	public boolean turboOn;

	public Saab952() {
		super(Color.BLACK, 125, "Saab952");
		stopEngine();
		turboOn = false;
	}
	/**
	 * s�tter p� turbon
	 */

	public void setTurboOn() {
		turboOn = true;
	}
	
	/**
	 * st�nger av turbon
	 */
	
	public void setTurboOff() {
		turboOn = false;
	}
	
	/**
	 * hur snabbt bilen �ker
	 */
	
	@Override
	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return getEnginePower() * 0.01 * turbo;
	}

}