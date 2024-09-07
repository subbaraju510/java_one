package tom;
import java.io.*;

public class MostFrequentstringarray {
	
	  public static void main(String args[])
	  {
	 // given set of keys
	    String arr[] = { "geeks",   "for",   "the", "a",    "portal",
	                    "to",      "learn", "geeks",   "and",   "computer",
	                    "science", "zoom",  "geeks",   "to", "in",
	                    "be",      "to",  "geeks" };  
	    //total geeks words 4-1=3
	    int n = arr.length;
	    // freq to store the freq of the most occurring variable
	    int freq = 0;

	    // res to store the most occurring string in the array of
	    // strings
	    String res = "";

	    // running nested for loops to find the most occurring
	    // word in the array of strings
	    for (int i = 0; i < n; i++) {
	      int count = 0;
	      for (int j = i + 1; j < n; j++) {
	        if (arr[j].equals(arr[i])) {
	          count++;
	        }
	      }

	      // updating our max freq of occurred string in the
	      // array of strings
	      if (count >= freq) {
	        res = arr[i];
	        freq = count;
	      }
	    }

	    System.out.println("The word that occurs most is : " + res);
	    System.out.println("No of times: " + freq);
	  }

	 
	}

	// This code is contributed by aadityaburujwale.
