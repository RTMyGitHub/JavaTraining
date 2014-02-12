/**
 * 
 * 
 * 
 * @author Venkata
 * 
 */
public class MedicareEligibilityCalculator {

	/**
	 * if age is 65 or above, he is eligible irrespective of state and sex if
	 * he/she has preexisting condition, he is eligible if age more than 45 and
	 * state is Texas or Hawai, he is eligible..
	 * 
	 * @param age
	 * @param hasPreExistingCondition
	 * @param state
	 * @return
	 */
	public boolean isEligible(int age, boolean hasPreExistingCondition,
			String state) {
		// If age is above 65, he/she is eligible for medicare because..
		if (age >= 65) {
			return true;
		} else if (hasPreExistingCondition) {
			return true;
		} else if ((age > 45) && (state.equals("TX") || state.equals("HI"))) {
			return true;
		} else {
			return false;
		}
	}

}
