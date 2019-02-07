import javafx.scene.paint.Color;

public abstract class truck extends Car {

	private boolean doorOpen = false;
	private int bedAngle = 0;
	
	public truck(Color C, double EP, String MN) {
		super(C, EP, MN);
	}

	public boolean setDoorOpen(boolean doorOpen) {
		return true;
	}
	
	public boolean setDoorClosed(boolean doorOpen) {
		return false;
	}
	
	public int incrementBedAngle(int bedAngle) {
		return bedAngle++;
	}
	
	public int decrementBedAngle(int bedAngle) {
		return bedAngle--;
	}
	
}
		
