package com.rent.hotel.com.model;

public class Student {
	
	private String Name; 
	private String Email;
	
	public Student() {
		
	}
	
	public Student(String n, String e) {
		Name = n; 
		Email = e; 
	}
	
	public void relatorio(Student [] rooms) {
		System.out.println("\nQuartos Ocupados");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}
	}

	@Override
	public String toString() {
		return Name + ", " + Email;
	} 
}
