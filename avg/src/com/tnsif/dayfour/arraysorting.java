package com.tnsif.dayfour;
import java.util.Arrays;
public class arraysorting {

	public static void main(String[] args) {
		int arr[]= {15,25,45,78,26,41,10,23,20};
		System.out.println("entered array is =");
		for(int num: arr)
		{
			System.out.println(num+"");
		}
		Arrays.sort(arr);
		
		System.out.println("sorted list of array");
		for(int num:arr)
		{
			System.out.println(num+"");
		}
		// TODO Auto-generated method stub

	}

}
