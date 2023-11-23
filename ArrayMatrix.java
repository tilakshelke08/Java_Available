package Matrix;

import java.lang.*;

public class ArrayMatrix {

	public static void main(String[] args) {
		int [][] Math1= { { 1,2,3   } ,
				          { 4,5,6  } };
	
		int [][] Math2= { {  2,6,13  } ,
				          {  3,7,1 } };
		
        int [][] Result= { { 0,0,0  } ,
                           { 0,0,0  } };
        
        for(int i=0;i<Math1.length;i++) {
        	for(int j=0;j<Math1[i].length;j++){
        		System.out.format("the value of i=%d and j=%d \n ",i,j);
        		Result[i][j]=Math1[i][j]+ Math2[i][j]; 
        		}
        };
        for(int i=0;i<Math1.length;i++) {
        	for(int j=0;j<Math1[i].length;j++){
        		System.out.print(Result[i][j]+" ");
        		Result[i][j]=Math1[i][j]+Math2[i][j]; 
        		};
    
        System.out.println(" ");
        
        }
        }
}
