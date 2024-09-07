package tom;

import java.util.Arrays;
import java.util.List;

public class ConvertarraytoArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};

// Conversion of array to ArrayList
// using Arrays.asList
List al = Arrays.asList(geeks);

System.out.println(al);
}
}

/*
 * String[] geeks = {"Rahul", "Utkarsh", "Shubham", "Neelam"};
 * 
 * List<String> al = new ArrayList<String>(Arrays.asList(geeks));
 * System.out.println(al);
 * 
 * // Adding some more values to the List. al.add("Shashank");
 * al.add("Nishant");
 * 
 * System.out.println("\nArrayList After adding two" + " more Geeks: ");
 * System.out.println(al);
 */