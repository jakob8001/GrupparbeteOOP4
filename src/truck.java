import javafx.scene.paint.Color;

public abstract class truck extends Car {
	
	/**
	 * skapar variabler f�r trucken
	 */
	private boolean doorOpen = false;
	private int bedAngle = 0;
	
	/**
	 * Skapar en Truck
	 */
	public truck(Color C, double EP, String MN) {
		super(C, EP, MN);
	}

	/**
	 * �ppnar d�rren
	 */
	public boolean setDoorOpen(boolean doorOpen) {
		return true;
	}
	
	/**
	 * st�nger d�rren
	 */
	public boolean setDoorClosed(boolean doorOpen) {
		return false;
	}
	
	/**
	 * h�jer flakets vinkel
	 */
	public int incrementBedAngle(int bedAngle) {
		return bedAngle++;
	}
	
	/**
	 * s�nker vinkeln av flaket
	 */
	public int decrementBedAngle(int bedAngle) {
		return bedAngle--;
	}
	
}

/**
 * Negrer odert
 */
		
