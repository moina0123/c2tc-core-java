package com.tnsif.dayfour;
import java.util.Scanner;
public class arraysample {

	public static void main(String[] args) {
		int size;
		System.out.println("enter the size of the array");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		int arr[]=new int[100];
		System.out.println("enter elements of the array");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("here is the array");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		// TODO Auto-generated method stub

	}

}
