package tom;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,3,6,7,3,9,20};
		int j=1;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i+1];
				j++;
				
			}
			//System.out.println(j);
			
		}
		System.out.println("array"+j);
		for(int i=0; i<j; i++) {
			System.out.println(arr[i]);
		}
	}

}
