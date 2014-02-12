public class ArrayDemo3 {

	public static void main(String[] arguments) {

		// Create and assign values to an array at the same time
		String[] names = { "Henry", "Jaya", "Manisha", "Mira" };

		System.out.println("5th name = " + names[3]);

		// for loop
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			System.out.println("Name = " + name);
		}

		// for each loop
		for (String name : names) {
			System.out.println("Name = " + name);
		}
	}

}
