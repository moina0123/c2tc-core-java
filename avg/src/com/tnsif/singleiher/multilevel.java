package com.tnsif.singleiher;

public class multilevel {

	private String name;
	private String address;
	private long phn;
	public multilevel(String name, String address, long phn) {
		super();
		this.name = name;
		this.address = address;
		this.phn = phn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "multilevel [name=" + name + ", address=" + address + ", phn=" + phn + "]";
	}
}
	