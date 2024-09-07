package tom;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4595;
		int reverse=0;
		while(num!=0) {
			int remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;

	}
		System.out.println("reverse number"+reverse);
	}
}
