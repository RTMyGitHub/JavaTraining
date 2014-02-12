package constructor;

public class Car {

	String make;
	String model;
	int year;
	int maximumSpeed;
	int currentSpeed;
	String color;
	boolean hasStarted;

	Car() {

	}

	Car(String newMake, String newModel) {
		make = newMake;
		model = newModel;
	}

	Car(String newMake) {
		make = newMake;
	}

	Car(String newModel, String newMake, int year) {

	}

	void start() {
		System.out.println("I am starting the car");
		hasStarted = true;

		currentSpeed = 0;
	}

	void stop() {
		System.out.println("Stopping the car");
		hasStarted = false;
		currentSpeed = 0;
	}

	void changeColor(String newColor) {
		color = newColor;
	}

	int accelerate(int howMuch) {
		currentSpeed = currentSpeed + howMuch;
		return currentSpeed;
	}

}
