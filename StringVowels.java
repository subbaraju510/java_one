package tom;

public class StringVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Wipro 33 66 88 #$#";
		String strtrim=str.trim();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				System.out.println("vowels=="+str.charAt(i));
			}
			else {
				System.out.println("consonents@@@"+str.charAt(i));
			}
		}

	}

}
