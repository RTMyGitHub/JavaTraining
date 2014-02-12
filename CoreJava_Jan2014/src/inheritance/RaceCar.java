package inheritance;

public class RaceCar extends Car {

	private boolean nitro;

	RaceCar(int year, String make, String model, boolean nitro) {
		super(make, model, year);

		this.nitro = nitro;
	}

	void race() {
		System.out.println("I am racing");
		accelerate(getMaximumSpeed());

	}

}
