import java.util.ArrayList;

import Car;

public class carLoader {

	private Car owner;
	public int size;

	public ArrayList<Car> Cars = new ArrayList<Car>();

	/**
	 * För att starta en loader
	 * 
	 */
	public carLoader(Car creator, int size) {
		this.owner = creator;
		this.size = size;
	}

	/**
	 * Största avstånd
	 */
	private int maxRange = 50;

	/**
	 * Kollar om avståndet är okej
	 */
	private boolean distanceXOk;
	private boolean distanceYOk;

	/**
	 * updaterar positionerna av bilarna
	 */
	public void updateAllPositions() {
		for (Car Car : Cars) {
			Car.setX(owner.getX());
			Car.setY(owner.getY()); /* finns inte :(*/
		}
	}

	/**
	 * Kollar om Cars flaket är fullt
	 * 
	 * @return
	 */
	public boolean isFull() {
		if (this.Cars.size() == size) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Lägger till bilar
	 * 
	 * @param v
	 */
	public void add(Car v) {
		this.Cars.add(v);
	}

	/**
	 * 
	 * Tar bort bilar
	 * 
	 * @param v
	 */
	public Car removeBackToFront() {
		Car v = this.Cars.get(0);
		this.Cars.remove(0);
		return v;
	}

	public Car removeFrontToBack() {
		Car v = this.Cars.get(size - 1);
		this.Cars.remove(size - 1);
		return v;
	}

	/**
	 * Kollar range
	 * 
	 * @param car
	 * @return
	 */
	public boolean inRange(Car car) {
		if (car.getX() < owner.getX() + maxRange && car.getX() > owner.getX() - maxRange) {
			distanceXOk = true;
		}
		if (car.getY() < owner.getY() + maxRange && car.getY() > owner.getY() - maxRange) {
			distanceYOk = true;
		}
		if (distanceYOk == true && distanceXOk == true) {
			return true;
		} else {
			return false;
		}
	}

}