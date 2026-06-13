package com.rent.hotel.com.main;

import java.util.Locale;
import java.util.Scanner;

import com.rent.hotel.com.model.Student;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		Student[] rooms = new Student[10];
		int quarto = 0, n = 0; 
		try {
			System.out.print("Quantos quartos serão alugados? ");
			n = ler.nextInt();
			ler.nextLine();
		}catch(java.util.InputMismatchException e) {
			System.out.println("Tipo de dado informado incorreto para quarto");
		}

		for (int i = 0; i < n; i++) {
			System.out.printf("Aluguel #%d\n", (i + 1));
			System.out.print("Nome: ");
			String name = ler.nextLine();
			System.out.print("Email: ");
			String email = ler.nextLine();
			try {
				System.out.print("Quarto: ");
				quarto = ler.nextInt();
				ler.nextLine();
			}catch(java.util.InputMismatchException e) {
				System.out.println("Tipo de dado informado incorreto para quarto");
			}
			if (rooms[quarto] != null) {
				System.out.println("Quarto já ocupado");
			} else {
				rooms[quarto] = new Student(name, email);
			}
			System.out.println();
		}

		Student s = new Student();
		s.relatorio(rooms);
		ler.close();
	}
}
