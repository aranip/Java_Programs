package BasicPrograms;
/*import java.util.HashSet;

public class OddOccuranceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));

	}

		    public static int solution(int[] A) {
		    	
		HashSet<Integer> dups = new HashSet<Integer>();
				int elem = -1;

				for (int i = 0; i < A.length; i++) {
					if (dups.add(A[i])) {
						elem = A[i];
					}
				}
				return elem;
			}
}
*/
//package BasicPrograms;
import java.util.HashSet;

public class OddOccuranceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));

	}
 public static int solution(int[] A) {
for (int i = 0; i < A.length; i++) {

for (int j = 0; j < A.length; j++) {
	if (A[i] == A[j] && i != j) {
		A[i] = -1;
		A[j] = -1;
		j = A.length;
	}
}
}

for (int i = 0; i < A.length; i++) {
if (A[i] != -1)
	return A[i];
}

return 0; // should never happen
}
} 