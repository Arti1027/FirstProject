package learning;

import java.util.Scanner;

public class Findnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to be searched");
		int num=sc.nextInt();
		int a[]= {100,9,9,8756,01};
		boolean b=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
				b=true;
									
		}
		if(b==true)
			System.out.println("number found");
		else
			System.out.println("number not found");
	
				
		
	}

}
