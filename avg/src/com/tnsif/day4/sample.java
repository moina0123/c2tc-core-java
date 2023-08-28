package com.tnsif.day4;

public class sample {

	public static void main(String[] args) 
	{
		int x=0;
		do
		{
			x++;
			System.out.println(x);
			if(x++<5)
				continue;
			x++;
			System.out.println(x);
		}while(x++<10);
		// TODO Auto-generated method stub

	}

}
