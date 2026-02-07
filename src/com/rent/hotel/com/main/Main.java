package com.rent.hotel.com.main;

import java.util.Locale;
import java.util.Scanner;

import com.rent.hotel.com.model.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		Student [] rooms = new Student[10]; 
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = ler.nextInt(); 
		
		for(int i = 0; i < n;i++) {
			
		}
		
		
		ler.close();
	}
}
