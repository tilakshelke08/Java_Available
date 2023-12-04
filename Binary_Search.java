package Binary.Searched;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
	// THIS IS A BINARY SEARHCED only in sorted array
	public static int Binary_Search(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (key == arr[mid]) {
				return mid;
			}
			if (key < arr[mid]) {
				right = mid - 1;
			} else
				left = mid + 1;

		}
		return -1;
	}

	public static void main(String[] args) {

		// THIS IS A BINARY SEARHCED
		Scanner sc = new Scanner(System.in);
		int[] arr = { 88, 33, 66, 99, 44, 77, 22, 55, 11 };

		Arrays.sort(arr);

		System.out.println("enter the number:-");
		int key = sc.nextInt();

		int index = Binary_Search(arr, key);
		if (index != -1) {
			System.out.println("the value of binary Searching index is " + index);
		} else {
			System.out.println("key not found ");

		}
	}
}
