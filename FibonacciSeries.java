package tom;

public class FibonacciSeries {
       public static void main(String args[]){
	int n1=0,n2=1,n3;
	int count=10;
	System.out.print("fibonacci series:");
	for(int i=2;i<count;++i){
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n2);
		
	}

	
}

}
