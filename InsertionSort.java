package App;

import java.util.Arrays;

public class InsertionSort {
public static void Insertion(int [] arr) {
  for(int i=1;i<arr.length;i++) {
	  int j, temp=arr[i];
	for( j=i-1;j>=0 && arr[j]>temp;j--) {
		
			arr[j+1]=arr[j];
	}
		
			arr[j+1]=temp;
	
	
	  
  }
}
	public static void main(String[] args) {
		int []arr= {98,56,23,99,1,37,89,43};
		System.out.println("insertion sort");
		System.out.println("before :"+Arrays.toString(arr));
		Insertion(arr);
		System.out.println("after :"+Arrays.toString(arr));
		System.out.println("insertion sort done !");
	}

}
