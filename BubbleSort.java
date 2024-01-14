package App;

import java.util.Arrays;

public class BubbleSort {
public static void Bubble(int [] arr) {
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
	}
	
}
	public static void main(String[] args) {
		 int []arr= {23,1,54,99,2,43,98,67};
		 System.out.println("Bubble sort");
		 System.out.println("before :"+Arrays.toString(arr));
		 Bubble(arr);
		 System.out.println("after :"+Arrays.toString(arr));
		 System.out.println(" bubble sort done ");
		

	}

}
