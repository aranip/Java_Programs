package BasicPrograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,arm=0,temp;
		//Scanner sc=new Scanner(System.in);
		int n = new Scanner(System.in).nextInt();
		System.out.println("Enter a number");
		//n=sc.nextInt();
		temp=n;
		while(n!=0)
		{
			a=n%10;
			arm=arm+(a*3);
			n=n/10;
		}
		if(arm==temp)
		System.out.println(temp+" is a armstrong number ");
		else
		System.out.println(temp+" is not a armstrong number ");
	        }
	}

