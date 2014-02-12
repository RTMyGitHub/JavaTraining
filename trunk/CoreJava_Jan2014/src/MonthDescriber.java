public class MonthDescriber {

	String describe(int numberOfMonth, String country) {
		String monthDescription = "Outside of USA..sorry, I can't calculate..";

		if (country.equals("USA")) {
			switch (numberOfMonth) {

			case 1:
				monthDescription = "January";
				break;

			case 2:
				monthDescription = "February";
				break;

			case 3:
				monthDescription = "March";
				break;

			default:
				monthDescription = "invalid month provided";
				break;
			}
		}

		return monthDescription;
	}

}
