package tom;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class TestProgramme {

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
		 System.out.println("Original array "+originalarray);
		 //hashmap for duplicate elemente remove
		 LinkedHashSet<String> hashcolors=new LinkedHashSet<String>(Arrays.asList(strColors));
		 //create newarray for hashset
		 String[] newArray=hashcolors.toArray(new String[hashcolors.size()]);
		 
		 System.out.println("sting+Array"+Arrays.toString(newArray));
	    }
	}