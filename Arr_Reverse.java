package ArrayReverse;

public class Arr_Reverse {

	public static void main(String[] args) {
		int [] Arr= {1,2,3,4,5,6,7};
		int l=Arr.length;
		int n=Math.floorDiv(l,2);
		int temp;
		for(int i=0;i<n;i++) {
			temp=Arr[i];
			Arr[i]=Arr[l-i-1];
			Arr[l-i-1]=temp;
			
	
		}
		for(int element:Arr) {
			System.out.println(element);
		}
	

	}

}
