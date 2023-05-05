package learning;

public class palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12121;
		int b,c=0, d=a;
		while(a!=0)
		{
			b=a%10;
			c=(c*10)+b;
			a=a/10;
		}
		
	System.out.println(d);
	System.out.println(c);
		if (d==c)
		System.out.println("palindrome number");
		else
		System.out.println("not palindrome number");	
	}


}
