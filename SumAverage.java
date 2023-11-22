package Average;

public class SumAverage {
	public static void main(String[] args) {
		float [] marks= {32.4f,34.6f,65.4f,78.6f,45.1f,23.9f,45.8f,65.5f};
		float sum=0;
		for(float element:marks) {
			sum=sum+element;
			
		}
		System.out.println("the sum of marks is="+sum) ;
		System.out.println("The Average Of Sum Is="+sum/marks.length);
		
		

	}

}
