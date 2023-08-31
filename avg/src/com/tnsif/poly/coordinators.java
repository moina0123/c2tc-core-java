package com.tnsif.poly;

public class coordinators 
{
 private float x;
 private float y;
 public coordinators()
 {
	 x=0.0f;
	 y=0.0f;
 }
public coordinators(float x, float y) {
	super();
	this.x = x;
	this.y = y;
}
public coordinators(float a)
{
	this.x = x;
	this.y = y;
}
@Override
public String toString() {
	return "coordinators [x=" + x + ", y=" + y + "]";
}
}

