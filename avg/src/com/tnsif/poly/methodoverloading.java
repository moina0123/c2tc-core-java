package com.tnsif.poly;

public class methodoverloading 
{
	static int addition(int a,int b)
	{
		return a+b;
	}
	static float addition(float a,float b)
{
	return a+b;
}
	static float addition(int a,float b)
    {
    	return a+b;
    }
	static float addition(float a,int b)
    {
    	return a+b;
    }
	static String addition(String a,String b)
    {
    	return a+b;
    }
}
