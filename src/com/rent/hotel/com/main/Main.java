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
		ler.nextLine(); 
		
		for(int i = 0; i < n;i++) {
			System.out.printf("Aluguel #%d\n", (i+1));
			System.out.print("Nome: ");
			String name = ler.nextLine();
			System.out.print("Email: ");
			String email = ler.nextLine();
			System.out.print("Quarto: ");
			int quarto = ler.nextInt();
			ler.nextLine(); 
			if (rooms[i] == null)
			{
			    rooms[quarto] = new Student(name,email);
			}
			System.out.println();
		}
		
		System.out.println("\nQuartos Ocupados");
		for(int i = 0; i < rooms.length; i++)
		{
		    if (rooms[i] != null)
		    {
		    		System.out.println(i + ": "+rooms[i]);
		    }
		}
			
		ler.close();
	}
}
