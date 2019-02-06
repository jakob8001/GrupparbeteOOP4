import javafx.scene.paint.Color;

public abstract class truck extends Car {

	private boolean doorOpen = false;
	
	public truck(Color C, double EP, String MN) {
		super(C, EP, MN);
	}

	public boolean setDoorOpen(boolean doorOpen) {
		return true;
	}
	
	public boolean setDoorClosed(boolean doorOpen) {
		return false;
	}
	
	
	
}
