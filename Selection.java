package App;

import java.util.*;

public class Selection {
   public static void SelectionSort(int []arr) {
	   for(int i=0;i<arr.length-1;i++) {
		   for(int j =i+1;j<arr.length;j++) {
			   if(arr[i] > arr[j]) {
				   int temp= arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
			   
		   }
			
		}
	   
   }
	public static void main(String[] args) {
		int []arr= {6,4,2,8,3,1};
		System.out.println("Selection sort ");
		System.out.println("before:"+Arrays.toString(arr));
		SelectionSort(arr);
		System.out.println("After:"+Arrays.toString(arr));
		System.out.println("selection Sort done !");
	}

}
