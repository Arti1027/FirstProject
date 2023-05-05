package learning;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c;
		
		c=a+b;
		a=c-a;
		b=c-b;
		
		System.out.println("swapped number values are"+"  a:" + a+ " b:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("new swapped number values are"+"  a:" + a+ " b:"+b);

	}

}
