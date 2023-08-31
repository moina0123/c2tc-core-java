package com.tnsif.singleiher;

public class Student extends citizens{
	private int rollno;
	private String collgN;
	public Student(String name, String adhr, String address, long phn, int rollno, String collgN) {
		super(name, adhr, address, phn);
		this.rollno = rollno;
		this.collgN = collgN;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollgN() {
		return collgN;
	}
	public void setCollgN(String collgN) {
		this.collgN = collgN;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collgN=" + collgN + "]";
	}
	

}
