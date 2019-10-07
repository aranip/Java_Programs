package BasicPrograms;

import java.util.Arrays;

public class CyclicRotationofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(solution(3, new int[] {3, 8, 9, 7, 6}));
   
	}
	public static int[] solution(int K,int[] A) {
		 if (A.length == 0){
             return A;
         }
         int modular = K % A.length;
         int index = A.length - modular;
         int newArray[] = new int[A.length];
         System.arraycopy( A, index, newArray, 0, A.length - index);
         if (index > 0){
             System.arraycopy( A, 0, newArray, A.length - index, index);
         }
         return newArray;
	 
	}

}
