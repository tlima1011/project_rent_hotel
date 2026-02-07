package com.rent.hotel.com.model;

public class Student {
	
	private String Name; 
	private String Email;
	
	
	public Student(String n, String e) {
		Name = n; 
		Email = e; 
	}
	
	
	@Override
	public String toString() {
		return Name + ", " + Email;
	} 
}
