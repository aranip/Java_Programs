package BasicPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int firstnum=0,secondnum=1,next;
		System.out.println("Fibonacci series is ");
		int i=0;
		while(i<n)
		{
		if(i<=1)
		    next=i;
		else
		{
		   next=firstnum+secondnum;
		   firstnum=secondnum;
		   secondnum=next;
		}
		System.out.println(next);
		i++;
		}
	}

}
