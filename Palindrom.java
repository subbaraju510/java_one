package tom;

public class Palindrom {
	public static void main(String args[]){
		int temp,r,n,sum=0;
		n=323;
		temp=n;
		while(n>0){
			
		
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		}
		 if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");   
		
		
	}

}
