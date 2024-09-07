package tom;

public class EquqlandDobleequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="raju";
		String s2="raju";
		String s3=s1+s2;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String as1=new String("raju");
		String as2=new String("raju");
		System.out.println("ddddd"+(as1==as2));  //
		System.out.println("equals"+as1.equals(as2));

	}

}
