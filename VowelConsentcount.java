package tom;

public class VowelConsentcount {

	public static void main(String[] args) {
		String str="we are learing java";
		int count=0; 
		int vowelscount=0;
		int consonentscount=0;
		for(int i=0; i<str.length(); i++) {
			//System.out.print("Ttoal characters:"+str.charAt(i));
			if(str.charAt(i)!=' ') {
				count++;
				//System.out.println(count++);
			}
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				vowelscount++;
			}
			else if(str.charAt(i)> 'a' && str.charAt(i)< 'z'){
				consonentscount++;
			}
			
		}
		
		
		System.out.println("Total no fo characters count"+count);
		System.out.println("Total no fo vowel characters count"+vowelscount);
		System.out.println("Total no fo consents characters count"+consonentscount);

	}

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
