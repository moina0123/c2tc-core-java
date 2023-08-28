package com.tnsif.day1;
import java.util.Scanner;
public class avg {

	public static void main(String[] args) {
		
		int size;
		System.out.println("enter size");
		Scanner s=new Scanner(System.in);
		size =s.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements");
		
		for(int k=0;k<size;k++)
		{
			arr[k]=s.nextInt();
		}
		 int sum=0;
		for(int k=0;k<size;k++)
		{
			sum=sum+arr[k];
		}
		int avg=sum/size;
		System.out.println("average is"+avg);
		// TODO Auto-generated method s
	}

}
