package tom;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveduplicateCharactersstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCABCABC";
		LinkedHashSet<Character> removeduplicate=new LinkedHashSet();
		for(char ch1:str.toCharArray()) {
	
			
			removeduplicate.add(ch1);
			//System.out.println("characters:"+removeduplicate);
		}
		for(char output:removeduplicate) {
			
			System.out.println("=====without duplicates:"+output);
		}
		System.out.println("without duplicates:"+removeduplicate);
	}

}
