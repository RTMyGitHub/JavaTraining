package inheritance;

import com.google.docs.excel.admin.Customer;

public class RaceCarDemo {

	public static void main(String[] args) {

		RaceCar raceCar = new RaceCar(2011, "Ford", "Focus", false);

		raceCar.start();
		raceCar.race();

		int currentSpeed = raceCar.getCurrentSpeed();
		System.out.println("Current speed = " + currentSpeed);

		System.out.println(raceCar.toString());

		Customer customer = new Customer();
	}

}
