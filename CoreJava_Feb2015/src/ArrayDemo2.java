public class ArrayDemo2 {

	public static void main(String[] args) {

		String[] students = new String[20];
		
		students[0] = "Anoop";
		students[1] = "Anteneh";
		students[2] = "Aruna";

		students[9] = "Satya";
		students[18] = "Ketan";
		
		System.out.println("Size of the array = " + students.length);
		
		for(int i=0; i<students.length; i++)
		{
			System.out.println(students[i]);
		}
	}

}
