import javafx.scene.paint.Color;

public abstract class Car implements Movable {

	private double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	private Color color; // Color of the car
	private float x,y;
	private String modelName; // The car model name
	
	
	public Car(Color C, double EP, String MN) {
		color = C;
		enginePower = EP;
		modelName = MN;
	}
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
	 * Returnerar färgen på fordonet
	 * @return
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * När man startar bilen 
	 */
	public void startEngine() {
		currentSpeed = 0.1;
	}
	/**
	 * När man stoppar bilen
	 */
	public void stopEngine() {
		currentSpeed = 0;
	}
	/**
	 * SpeedFactor är det som skiljer åt alla bilar när det kommer till fart. Alla bilar kommer returnera olika
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
		if (getCurrentSpeed() + speedFactor() * amount < currentSpeed) return;
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}
	
	/**
	 * saktar ner bilen
	 * @param amount
	 */
	
	public void decrementSpeed(double amount) {
		if (getCurrentSpeed() - speedFactor() * amount > currentSpeed) return;
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
	 * svänger vänster med bilen
	 */
	@Override
	public void turnLeft() {
		x-=currentSpeed;
	}
	
	/**
	 * svänger höger med bilen
	 */
	@Override
	public void turnRight() {
		x+=currentSpeed;
	}
	
	
}
