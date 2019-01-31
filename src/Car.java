import javafx.scene.paint.Color;

public abstract class Car implements Movable {

	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	private float x,y;
	public String modelName; // The car model name
	
	/**
	 * Returnerar enginePower 
	 * @return
	 */
	public double getEnginePower() {
		return enginePower;
	}

	/**
	 * Returnerar den nuvaranade farten
	 * @return
	 */
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	/**
	 * Returnerar f�rgen p� fordonet
	 * @return
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * N�r man startar bilen 
	 */
	public void startEngine() {
		currentSpeed = 0.1;
	}
	/**
	 * N�r man stoppar bilen
	 */
	public void stopEngine() {
		currentSpeed = 0;
	}
	/**
	 * SpeedFactor �r det som skiljer �t alla bilar n�r det kommer till fart. Alla bilar kommer returnera olika
	 * @return
	 */
	public double speedFactor() {
		return enginePower;
	}
	
	/**
	 * accelererar bilen
	 * @param amount
	 */
	public void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
		
		
		
	}
	
	/**
	 * saktar ner bilen
	 * @param amount
	 */
	
	public void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}
	
	/**
	 * accelererar bilen med variabeln amount
	 * @param amount (kan bara vara mellan 0-1)
	 */
	public void gas(double amount) {
		if (amount > 0 && amount < 1) {
			incrementSpeed(amount);
			
		}
		
	}
	
	/**
	 * bromsar ner bilen
	 * @param amount
	 */
	
	public void brake(double amount) {
		decrementSpeed(amount);
		
	}
	
	

	@Override
	public void move() {
		
	}
	/**
	 * sv�nger v�nster med bilen
	 */
	@Override
	public void turnLeft() {
		x-=currentSpeed;
	}
	
	/**
	 * sv�nger h�ger med bilen
	 */
	@Override
	public void turnRight() {
		x+=currentSpeed;
	}
	
	
}
