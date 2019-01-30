import javafx.scene.paint.Color;

public abstract class Car implements Movable {

	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	private float x,y;
	public String modelName; // The car model name

	public double getEnginePower() {
		return enginePower;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public Color getColor() {
		return color;
	}

	public void startEngine() {
		currentSpeed = 0.1;
	}

	public void stopEngine() {
		currentSpeed = 0;
	}

	public double speedFactor() {
		return enginePower;
	}

	public void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	public void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}
	
	public void gas(double amount) {
		if (amount > 0 && amount < 1) {
			incrementSpeed(amount);
		}
		
	}
	
	/**
	 * accelererar bilen
	 * @param amount
	 */
	
	public void brake(double amount) {
		decrementSpeed(amount);
		
	}
	
	/**
	 * bromsar ner bilen
	 * @param amount
	 */

	@Override
	public void move() {
		
	}
	
	@Override
	public void turnLeft() {
		x-=currentSpeed;
	}
	
	/**
	 * svänger vänster med bilen
	 */
	
	@Override
	public void turnRight() {
		x+=currentSpeed;
	}
	
	/**
	 * svänger höger med bilen
	 */
}
