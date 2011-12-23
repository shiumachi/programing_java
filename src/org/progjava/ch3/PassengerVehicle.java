package org.progjava.ch3;

import org.progjava.ch2.Vehicle;

public class PassengerVehicle extends Vehicle {
	private int maxSeats;
	private int currentSeats;

	public PassengerVehicle() {
		this(0.0, 0.0, "none", 0);
	}

	public PassengerVehicle(double currentVelocity, double currentDirection,
			String ownerName, int id) {
		this(currentVelocity, currentDirection, ownerName, id, 4, 0);
		// TODO Auto-generated constructor stub
	}

	public PassengerVehicle(double currentVelocity, double currentDirection,
			String ownerName, int id, int maxSeats, int currentSeats) {
		super(currentVelocity, currentDirection, ownerName, id);
		this.maxSeats = maxSeats;
		this.currentSeats = currentSeats;
	}

	public void setMaxSeats(int maxSeats) {
		this.maxSeats = maxSeats;
	}

	public int getMaxSeats() {
		return maxSeats;
	}

	public void setCurrentSeats(int currentSeats) {
		this.currentSeats = currentSeats;
	}

	public int getCurrentSeats() {
		return currentSeats;
	}

	public String toString() {
		String str = Double.toString(this.getCurrentVelocity()) + " "
				+ Double.toString(this.getCurrentDirection()) + " "
				+ this.getOwnerName() + " " + Integer.toString(this.getId())
				+ " " + Integer.toString(this.getMaxSeats()) + " "
				+ Integer.toString(this.getCurrentSeats());
		return str;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 1) {
			PassengerVehicle your_car = new PassengerVehicle(100.0, 100.0, args[0], 100);
			System.out.printf("%s\n", your_car);
		}

		PassengerVehicle car = new PassengerVehicle(10.0, 20.0, "tom", 1, 6, 1);
		PassengerVehicle car2 = new PassengerVehicle(11.0, 3.0, "jon", 2, 2, 2);
		PassengerVehicle car3 = new PassengerVehicle(15.0, 4.0, "jon", 10, 100, 10);

		System.out.printf("car: %s\n", car);
		System.out.printf("car2: %s\n", car2);
		System.out.printf("car3: %s\n", car3);
		System.out.printf("max id: %d\n", PassengerVehicle.getMaxId());

		System.out.printf("stop\n");
		car.stop();
		System.out.printf("car: %s\n", car);

		System.out.printf("turn 20 degrees\n");
		car.turn(20.0);
		System.out.printf("car: %s\n", car);

		System.out.printf("turn 400 degrees\n");
		car.turn(400.0);
		System.out.printf("car: %s\n", car);

		System.out.printf("turn right\n");
		car.turn(PassengerVehicle.TURN_RIGHT);
		System.out.printf("car: %s\n", car);

	}

}
