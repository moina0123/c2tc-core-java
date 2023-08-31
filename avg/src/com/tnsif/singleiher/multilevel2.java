package com.tnsif.singleiher;

public class multilevel2 extends multilevel{
	private String dept;
	private String city;
	public multilevel2(String name, String address, long phn, String dept, String city) {
		super(name, address, phn);
		this.dept = dept;
		this.city = city;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "multilevel2 [dept=" + dept + ", city=" + city + "]";
	}
}
	

	


