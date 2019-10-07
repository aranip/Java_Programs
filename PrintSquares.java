package BasicPrograms;

public class PrintSquares {

	public static void main(String[] args) {
		// print the squares of first 100 integers

for(int i =0; i<101; i++){
	System.out.print(" " + i * i);
	
	if (i % 10 == 0)
		System.out.println(" " + i);

}
	}

}
