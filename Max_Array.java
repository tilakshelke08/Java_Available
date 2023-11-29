package max_array;

public class Max_Array {

	public static void main(String[] args) {
		int[] Num = { 23, 45, 90, 32, 553, 2963, 11, 43, 87, 1000 };
		int Max = 0;
		for (int max : Num) {
			if (max > Max) {

				Max = max;
			}

		}
		System.out.println("The max no of array is :- " + Max);
	}

}
