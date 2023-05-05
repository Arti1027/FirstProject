package learning;

public class Numberofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1212121;
		int b,c=0,i=0,j=0,x=0;
		while(a!=0)
		{
			b=a%10;
			{if (b%2!=0)
			{System.out.println("odd : "+b);
			++i;}
			else
			{System.out.println("even : "+b);
			++j;}
			c=(c*10)+b;
			a=a/10;
			x=x+b;
			}
					
		}
		
		System.out.println("even : "+i);
		System.out.println("odd : "+j);
		System.out.println("sum : "+x);
	}
}