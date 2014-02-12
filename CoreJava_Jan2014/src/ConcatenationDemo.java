public class ConcatenationDemo {

	public static void main(String[] args) {

		String oneString = "1";
		String twoString = "2";

		int one = Integer.parseInt(oneString);
		int two = Integer.parseInt(twoString);

		String speed1 = "123.56";
		String speed2 = "75.87";

		System.out.println(one + two);
		System.out.println(Double.parseDouble(speed1)
				+ Double.parseDouble(speed2));

	}

}
