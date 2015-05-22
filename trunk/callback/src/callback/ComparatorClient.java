package callback;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorClient {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Mounika","Yuri", "Rohit", "Sailaja");
		
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		System.out.println(names);
	}
}
