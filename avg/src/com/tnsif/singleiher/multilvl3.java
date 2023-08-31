package com.tnsif.singleiher;

public class multilvl3 extends multilevel2 {
	private int id;

	public multilvl3(String name, String address, long phn, String dept, String city, int id) {
		super(name, address, phn, dept, city);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "multilvl3 [id=" + id + "]";
	}
	

}
