public class ArrayDemo {

	public static void main(String[] args) {

		// Declared and created
		int[] ages = new int[10];

		// Assign some values
		ages[0] = 23;
		ages[1] = 34;
		ages[2] = 51;
		ages[3] = 65;

		// Reading the values from an array
		System.out.println("Size of the array = " + ages.length);
		System.out.println("1st value " + ages[0]);
		System.out.println("3rd value " + ages[2]);
		System.out.println("Last value " + ages[9]);

		// Read all the values of an array
		for (int i = 0; i < ages.length; i++) {
			System.out.println("Value at index " + i + " is " + ages[i]);
		}

		// for each loop
		for (int age : ages) {
			System.out.println("Age = " + age);
		}

	}

}
