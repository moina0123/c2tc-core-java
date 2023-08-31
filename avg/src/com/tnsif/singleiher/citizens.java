package com.tnsif.singleiher;

public class citizens {
	private String name;
	private String adhr;
	private String address;
	private long phn;

	public citizens(String name, String adhr, String address, long phn) {
		super();
		this.name = name;
		this.adhr = adhr;
		this.address = address;
		this.phn = phn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdhr() {
		return adhr;
	}

	public void setAdhr(String adhr) {
		this.adhr = adhr;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhn() {
		return phn;
	}

	public void setPhn(long phn) {
		this.phn = phn;
	}

	@Override
	public String toString() {
		return "citizens [name=" + name + ", adhr=" + adhr + ", address=" + address + ", phn=" + phn + "]";
	}
}
	

