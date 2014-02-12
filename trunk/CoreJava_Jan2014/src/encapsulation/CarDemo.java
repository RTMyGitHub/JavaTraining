package encapsulation;

public class CarDemo {

	public static void main(String[] args) {

		// Car focus = new Car("Ford", "Focus");

		Car focus = new Car("Ford", "Focus", 2013, "black");

		focus.setColor("red");

		focus.accelerate(45734756);

		System.out.println("Make of the car = " + focus.getMake());
		System.out.println("current speed = " + focus.getCurrentSpeed());
		System.out.println("Color of the car = " + focus.getColor());

	}

}
