package com.rent.hotel.com.main;

import java.util.Locale;
import java.util.Scanner;

import com.rent.hotel.com.model.Student;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		Student[] rooms = new Student[10];

		System.out.print("Quantos quartos serão alugados? ");
		int n = ler.nextInt();
		ler.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.printf("Aluguel #%d\n", (i + 1));
			System.out.print("Nome: ");
			String name = ler.nextLine();
			System.out.print("Email: ");
			String email = ler.nextLine();
			System.out.print("Quarto: ");
			int quarto = ler.nextInt();
			ler.nextLine();
			//System.out.println(rooms[quarto]);
			//while (rooms[quarto] != null) {
			if (rooms[quarto] != null) {
				System.out.println("Quarto já ocupado");
			} else {
				rooms[quarto] = new Student(name, email);
			}
			//}
//			if (rooms[quarto] == null)
//			{
//			    
//			}
			System.out.println();
		}

		Student s = new Student();
		s.relatorio(rooms);
		ler.close();
	}
}
