package org.progjava.ch2;

public class Vehicle {
	public static final int TURN_LEFT = 0;
	public static final int TURN_RIGHT = 1;
	private double currentVelocity;
	private double currentDirection;
	private String ownerName;
	private static int vehicleID;
	private static int maxId;
	private int id;

	public Vehicle() {
		this(0.0, 0.0, "none", 0);
	}

	public Vehicle(double currentVelocity, double currentDirection,
			String ownerName, int id) {
		super();
		this.currentVelocity = currentVelocity;
		this.currentDirection = currentDirection;
		this.ownerName = ownerName;
		this.setId(id);
	}

	public void setCurrentVelocity(double currentVelocity) {
		this.currentVelocity = currentVelocity;
	}

	public double getCurrentVelocity() {
		return currentVelocity;
	}

	public void setCurrentDirection(double currentDirection) {
		if (currentDirection >= 360.0) {
			currentDirection -= 360.0;
		} else if (currentDirection < 0.0) {
			currentDirection += 360.0;
		}
		this.currentDirection = currentDirection;
	}

	public double getCurrentDirection() {
		return currentDirection;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String toString() {
		String str = Double.toString(this.getCurrentVelocity()) + " "
				+ Double.toString(this.getCurrentDirection()) + " "
				+ this.getOwnerName() + " " + Integer.toString(this.getId());
		return str;
	}

	public void stop() {
		setCurrentVelocity(0.0);
		return;
	}

	public void turn(double angle) {
		setCurrentDirection(getCurrentDirection() + angle);
		return;
	}

	public void turn(int direction) {
		if (direction == Vehicle.TURN_LEFT) {
			turn(90.0);
		}

		switch (direction) {
		case Vehicle.TURN_LEFT:
			turn(90.0);
			break;
		case Vehicle.TURN_RIGHT:
			turn(-90.0);
			break;
		default:
			throw new IllegalArgumentException();
		}

	}

	public static void main(String[] args) {
		if(args.length == 1){
			Vehicle your_car = new Vehicle(100.0, 100.0, args[0], 100);
			System.out.printf("%s\n", your_car);
		}
		
		Vehicle car = new Vehicle(10.0, 20.0, "tom", 1);
		Vehicle car2 = new Vehicle(11.0, 3.0, "jon", 2);
		Vehicle car3 = new Vehicle(15.0, 4.0, "jon", 10);

		System.out.printf("car: %s\n", car);
		System.out.printf("car2: %s\n", car2);
		System.out.printf("car3: %s\n", car3);
		System.out.printf("max id: %d\n", Vehicle.getMaxId());

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
		car.turn(Vehicle.TURN_RIGHT);
		System.out.printf("car: %s\n", car);

	}

	public void setId(int id) {
		this.id = id;
		setMaxId(id);
	}

	public int getId() {
		return id;
	}

	private static void setMaxId(int id) {
		if (Vehicle.maxId < id) {
			Vehicle.maxId = id;
		}
	}

	public static int getMaxId() {
		return maxId;
	}

}
