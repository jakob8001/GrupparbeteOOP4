import javafx.scene.paint.Color;

public abstract class truck extends Car {
	
	/**
	 * skapar variabler för trucken
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
	 * öppnar dörren
	 */
	public boolean setDoorOpen(boolean doorOpen) {
		return true;
	}
	
	/**
	 * stänger dörren
	 */
	public boolean setDoorClosed(boolean doorOpen) {
		return false;
	}
	
	/**
	 * höjer flakets vinkel
	 */
	public int incrementBedAngle(int bedAngle) {
		return bedAngle++;
	}
	
	/**
	 * sänker vinkeln av flaket
	 */
	public int decrementBedAngle(int bedAngle) {
		return bedAngle--;
	}
	
}

/**
 * Negrer odert
 */
		
