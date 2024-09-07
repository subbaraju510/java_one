package tom;
import java.util.*;

public class UniqueCharacterstring {

	public static void main(String[] args)
	{
		String str ="teekj";
		for(int i=0; i<str.length();i++) {
			int flag=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && i!=j) {
					flag=1;
					break;
					
				}
				
			}
			if(flag==0) {
				System.out.println( str.charAt(i));
			}
			
		}
	}
	}

	// This code is contributed by gauravrajput1
