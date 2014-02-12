public class Test {

	public static void main(String[] args) {

		int age = 6;
		do {
			System.out.println("Age = " + age++);
		} while (age < 10);

		String name = (age == 6) ? "Venkat" : "Hari";
		System.out.println("Name = " + name);

	}

}
