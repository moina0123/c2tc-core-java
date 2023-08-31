package com.tnsif.poly;

public class executor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Method overloading");
      System.out.println("addition of two no.s:"+methodoverloading.addition(100,120));
      System.out.println("addition of two no.s:"+methodoverloading.addition(100.2f,120.3f));
      System.out.println("addition of two no.s:"+methodoverloading.addition(100,120.3f));
      System.out.println("addition of two no.s:"+methodoverloading.addition(100.2f,120));
      System.out.println("cancatenation"+methodoverloading.addition("moina","mubashira"));
      
      System.out.println("constructor overloading");
      coordinators p=new coordinators();
      System.out.println(p);
      coordinators p1=new coordinators(62.3f,62.3f);
      System.out.println(p1);
      coordinators p2=new coordinators(12.33f);
      System.out.println(p2);
	}

}
