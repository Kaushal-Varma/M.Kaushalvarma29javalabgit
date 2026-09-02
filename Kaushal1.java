package com.solutions.kaushal;

public class Kaushal1 {
	private String cls;
	private int rollNo;
	private double gpa;
	
	public Kaushal1(String c, int r, double g) {
		cls = c;
		rollNo = r;
		gpa = g;
	}
	
	public void show() {
		System.out.println("Roll No. : " + rollNo + " || class : " + cls + " || gpa : " + gpa);
	}
}
