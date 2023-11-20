package SumArray1;

public class SumArray {

	public static void main(String[] args) {
		float [] Marks= {23.5f,56.6f,89.4f,92.3f,54.8f};
	float sum=0;
		for(float element : Marks) {
			sum=sum+element;
			
		}
	
System.out.println("the sum of Array is :-"+sum);
	}

}
