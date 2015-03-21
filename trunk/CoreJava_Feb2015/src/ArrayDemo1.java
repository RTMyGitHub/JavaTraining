
public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] students = new String[20];
		
		students[0] = "Anoop";
		students[1] = "Anteneh";
		students[2] = "Aruna";
		
		students[9] = "Satya";
		students[18] = "Ketan";
		
		
		students[12] = "Uma";
		
		/*System.out.println("3rd student is " + students[2]);
		System.out.println("2nd student is " + students[1]);
		System.out.println("10th student is " + students[19]);*/
		
		
		for(String student : students)
		{
			System.out.println(student);
		}
		
		
		

	}

}
