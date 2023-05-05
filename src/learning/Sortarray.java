package learning;

import java.util.Arrays;

public class Sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,434,56,123,9,121,23};
		//int b[]=a.sort();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
