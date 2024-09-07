package tom;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatewordsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="this is subbaraju this is working ";
   String[] words=str.split(" ");
   LinkedHashSet<String> duplicatewords =new LinkedHashSet<String>();
 //  Set<String> duplicatewords=new LinkedHashSet<String>();
   for(String dup :words) {
	   duplicatewords.add(dup);
	   System.out.println(duplicatewords);
	   
   }
   for(String output:duplicatewords) {
	   System.out.println(output);
	   
   }
	/*
	 * Iterator itr=duplicatewords.iterator(); 
	 * while(itr.hasNext()) {
	 * System.out.println(itr.next()+"");
	 * 
	 * }
	 */
	}

}
