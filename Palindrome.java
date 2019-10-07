package BasicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp = n;
		int sum =0 ,r;
		while(n > 0){
			r = n%10;
			sum = sum *10 +r;
			n = n/10;
		}
		if(sum == temp){
		System.out.println("Its Palindrome");
		}
		else{
			System.out.println("Its not palindrome");
		}
	}

}
