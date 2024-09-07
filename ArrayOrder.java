package tom;

public class ArrayOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,9,5,76};
		int temp=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			System.out.println("array order"+arr[i]);
			
		}
		System.out.println("highest value"+arr[arr.length-1]);
		
	}

}
