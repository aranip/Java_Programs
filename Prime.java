package BasicPrograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
        System.out.print("Enter n value : ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Prime numbers between 1 to "+n+" are ");
for(int i=2;i<=n;i++){
int count=0;
for(int j=1;j<=i;j++){
if(i%j==0){
     count++;        
}
}
if(count==2)
    System.out.print(i+"  ");     
}
	}

}
