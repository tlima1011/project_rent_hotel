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
			System.out.printf("Aluguel #{%d}\n", (i+1));
			System.out.print("Nome: ");
			String name = ler.nextLine();
			System.out.print("Email: ");
			String email = ler.nextLine();
			System.out.print("Quarto: ");
			int quarto = ler.nextInt();
			if (rooms[quarto] == null)
			{
			    rooms[quarto] = new Student(name,email);
			}
		}
		
		System.out.println("Quartos Ocupados");
		for(int i = 0; i < rooms.length; i++)
		{
		    if (rooms[i] != null)
		    {
		    		System.out.printf("%d: %.2f", i, rooms[i]);
		    }
		}
		
		
		
		
		ler.close();
	}
}
