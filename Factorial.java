package BasicPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	 long fact =1;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		for (int i =1; i<=num; i++){
			fact = fact * i;
			System.out.println("The factorial is  "+ fact);
		}

	}

}
