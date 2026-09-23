package com.solutions.kaushal;

public class Kaushal1 {
	private String cls;
	private int rollNo;
	private double gpa;
	
	public Kaushal1(String cls, int rollNo, double gpa) {
		this.cls=cls;
		this.rollNo=rollNo;
		this.gpa=gpa;
	}
	
	public void show() {
		System.out.println("Roll No. : " + rollNo + " || class : " + cls + " || gpa : " + gpa);
	}
}
