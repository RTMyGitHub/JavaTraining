public class MonthDescriberDemo {

	public static void main(String[] args) {

		MonthDescriber describer = new MonthDescriber();

		String description = describer.describe(13, "INDIA");

		System.out.println("Description = " + description);

	}

}
