package tom;

public class DuplicateremoveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,2,3,3,4};
		int j=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i+1];
				j++;
			}
		}
		System.out.println("Total uniqure values"+j);
		for(int i=0;i<j;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

}
