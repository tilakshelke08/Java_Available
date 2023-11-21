package FArray;

import java.util.*;

public class SearchArray {
	public static void main(String[] args) {
		float[] Number = { 22.3f, 44.3f, 65.4f, 98.6f, 78.8f };
		float b = 78.8f;
		boolean IsinArray = false;
		for (float element : Number) {
			if (b == element) {
				IsinArray = true;
				break;
			}

		}
		if (IsinArray) {
			System.out.println("the num is Present in Array");
		} else {
			System.out.println("the num is not Present in Array");
		}
	}
}
