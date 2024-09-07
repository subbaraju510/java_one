package tom;

public class DuplicatecharacterPrint {
	public static void main(String args[]){
		
	
String str="Beautifulbear";
char[] strone=str.toCharArray();
System.out.println("The string is:" + str);

System.out.println("Duplicate characters above string:");
for(int i=0;i<str.length();i++){
	for(int j=i+1;j<str.length();j++){
		if(strone[i]==strone[j]){
			System.out.println(strone[j]+"");
			break;
			
		}
		
	}
	
}

}
}