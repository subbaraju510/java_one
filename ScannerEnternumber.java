package tom;

import java.util.Scanner;

public class ScannerEnternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int i, fact=1;
		//int number=5;
		for( i=1; i<=number; i++) {
			fact=fact*i;
			
			
		}
		System.out.println("factorial number: "+ fact);
	}

}
