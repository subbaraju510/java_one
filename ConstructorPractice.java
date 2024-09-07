package tom;

public class ConstructorPractice {
	int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorPractice cp =new ConstructorPractice();  //output 20
		//ConstructorPractice cp =new ConstructorPractice(67);  //output 67
		//System.out.println("hello world");
		System.out.println(cp.i);

	}
	public ConstructorPractice() {  //default constructor
		i=20;
		System.out.println("constructor called");
	}
	public ConstructorPractice(int a) {  //parameter constructor
		i=a;
		
	}


}
