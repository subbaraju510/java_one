package tom;

public class ArrayDuplicateremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,5,4,7,6,7};
		int arrlength=arr.length;
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0; i<arrlength-1; i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
			
		}
		temp[j++]=arr[arrlength-1];
		for(int k=0;k<j; k++) {
			System.out.println("remove duplicates"+temp[k]);
		}
		

	}

}
