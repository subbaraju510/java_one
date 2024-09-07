package tom;

import java.util.HashMap;
import java.util.Map;

public class PrintallcharactersCountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcometoindiathe";
		char[] arr1=str.toCharArray();
		Map<Character, Integer> map=new HashMap<Character,Integer>();
		for(char arr:arr1) {
			if(map.containsKey(arr)) {   //initial map=0
				map.put(arr, map.get(arr)+1);
				
			}else {
				map.put(arr, 1);
			}
			
		}
		System.out.println(map);
			for(Map.Entry<Character, Integer> entry:map.entrySet()) {
				if(entry.getValue() >1) {
					//if(entry.getValue() ==1) {  //unique character count
					System.out.println(entry.getKey()+":"+entry.getValue());
					
					
				}
				
			}
	}
	

}
