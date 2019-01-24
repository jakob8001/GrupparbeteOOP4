import javafx.scene.paint.Color;

public class Saab952 extends Car {

	public boolean turboOn;

	public Saab952() {
		color = Color.BLACK;
		enginePower = 125;
		turboOn = false;
		modelName = "Saab95";
		stopEngine();
	}

	public void setTurboOn() {
		turboOn = true;
	}

	public void setTurboOff() {
		turboOn = false;
	}
	
	@Override
	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return enginePower * 0.01 * turbo;
	}

}