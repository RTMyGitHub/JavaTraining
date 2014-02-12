public class Driver {

	public static void main(String[] args) {

		Car volt = new Car();

		volt.changeColor("Black");
		System.out.println("Color now is " + volt.color);

		volt.start();

		volt.changeColor("Blue");

		System.out.println("Current speed = " + volt.currentSpeed);
		volt.accelerate(20);
		volt.accelerate(30);
		volt.accelerate(60);

		System.out.println("Color now is " + volt.color);
		System.out.println("Current speed = " + volt.currentSpeed);

		volt.stop();

		System.out.println("Current speed = " + volt.currentSpeed);
	}

}
