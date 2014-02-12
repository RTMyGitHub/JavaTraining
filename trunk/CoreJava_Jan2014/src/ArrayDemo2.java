
public class ArrayDemo2 {

	public static void main(String[] args) {

		Car[] cars = new Car[3];

		Car car1 = new Car();
		car1.make = "Ford";
		car1.model = "Mustang";

		Car car2 = new Car();
		car2.make = "Chevy";
		car2.model = "Corvette";

		Car car3 = new Car();
		car3.make = "Chrysler";
		car3.model = "Town & Country";

		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;

		for (Car c : cars) {
			System.out.println("Make of car = " + c.make);
			System.out.println("Model of car = " + c.model);
		}

	}

}
