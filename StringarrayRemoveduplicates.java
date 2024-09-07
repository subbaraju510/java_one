package tom;
//https://www.javacodeexamples.com/java-string-array-remove-duplicates-example/849
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class StringarrayRemoveduplicates
 {

	 public static void main(String[] args) {
	        
	        String[] strColors = {
	                "red",
	                "blue",
	                "green",
	                "red", //duplicate
	                "yellow",
	                "green"    //duplicate            
	        };
	        String originalarray=Arrays.toString(strColors);
	        
	        
	        System.out.println("Original array: " 
	                    + originalarray);
	        
	        /*
	         * convert array to list and then add all
	         * elements to LinkedHashSet. LinkedHashSet
	         * will automatically remove all duplicate elements. 
	         */
	        LinkedHashSet<String> lhSetColors =  
	                new LinkedHashSet<String>(Arrays.asList(strColors));
	       
	        //create array from the LinkedHashSet
	        System.out.println("asLisddddddt array: "+ Arrays.asList(strColors));
	        String[] newArray = lhSetColors.toArray(new String[ lhSetColors.size() ]);
	        
	        System.out.println("Array after removing duplicates: " 
	                + Arrays.toString(newArray));
	 
	    }
	}