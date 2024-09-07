package tom;

public class StringfistandLastword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String strtrim="welcome to india hello";
//String strtrim=str.trim()
int pos1=strtrim.indexOf(' ');
int pos2=strtrim.lastIndexOf(' ');
String firstword=strtrim.substring(0,pos1);
String lastword=strtrim.substring(pos2+1);
System.out.println("firstword=="+firstword);
System.out.println("lastword=="+lastword);


	}

}
