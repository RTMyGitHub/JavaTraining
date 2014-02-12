public class MedicareEligibilityCalculatorDemo {

	public static void main(String[] args) {

		MedicareEligibilityCalculator calculator = new MedicareEligibilityCalculator();

		boolean isEligibleFor25MaleInMI = calculator.isEligible(25, true, "MI");
		System.out
				.println("Am I eligible with 25 with pre existing in Michigan "
						+ isEligibleFor25MaleInMI);

		boolean isEligibleFor45InTX = calculator.isEligible(45, false, "TX");
		System.out.println("Am I eligible with 45 with no pre existing in TX "
				+ isEligibleFor45InTX);

		boolean isEligibleFor65InHI = calculator.isEligible(65, false, "HI");
		System.out.println("Am I eligible with 65 with no pre existing in HI "
				+ isEligibleFor65InHI);

	}

}
