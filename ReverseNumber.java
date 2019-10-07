package BasicPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rev,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		while(num!=0){
		rev=num%10;
		result=(result*10)+rev;
		num=num/10;
		}
		System.out.println("reverse of a number is "+result);
		

	}

}
