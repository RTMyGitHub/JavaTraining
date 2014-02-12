public class CalculatorDemo {

	public static void main(String[] args) {

		// 2 + 3

		String operand1 = args[0];
		String operaor = args[1];
		String operand2 = args[2];

		System.out.println("operand1 = " + operand1);
		System.out.println("operaor = " + operaor);
		System.out.println("operand2 = " + operand2);

		int op1 = Integer.parseInt(operand1);
		int op2 = Integer.parseInt(operand2);

		if (operaor.equals("+")) {
			System.out.println("Result = " + (op1 + op2));
		} else if (operaor.equals("-")) {
			System.out.println("Result = " + (op1 - op2));
		}

	}

}
