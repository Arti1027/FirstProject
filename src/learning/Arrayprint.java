package learning;

import java.util.Scanner;

public class Arrayprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number- ");
		int m= sc.nextInt();
		int a[]= {12,34,32,33,45};
		int b=0;
		System.out.println("odd1 :"+b);
		
		int res=0;		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.println("odd :"+a[i]);
			else
				System.out.println("even :"+a[i]);
			res=res+a[i];
			
		}
		System.out.println("Sum : "+ res);
	}
		

}
