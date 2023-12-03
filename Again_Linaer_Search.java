package Linear;

import java.util.Scanner;

public class Again_Linaer_Search {
// this is a linear search......
	public static int Linear_Search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key)
			return i;
		}
		return -1;
	}


	public static void main(String[] args) {
//		this is aa linear searched ..
		Scanner sc = new Scanner(System.in);
		int[] arr = { 99, 88, 77, 66, 55, 44, 33, 22, 11, 00 };
		System.out.println();
		int key = sc.nextInt();
		int index = Linear_Search(arr, key);
		if (index != -1) {
			System.out.println("the  value of index :-"+index);
		}
		else {
			
	
		System.out.println("key not found ");
		}

	}
}
