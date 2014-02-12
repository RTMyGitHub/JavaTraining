public class HelloWorldWithArgument {

	public static void main(String[] args) {

		System.out.println("Array length = " + args.length);
		String name = args[0];
		String secondName = args[1];
		String thirdName = args[2];

		System.out.println("Hello " + name);
		System.out.println("Hello " + secondName);
		System.out.println("Hello " + thirdName);

	}

}
