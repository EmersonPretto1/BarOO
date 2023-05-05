package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill bil = new Bill();

		System.out.print("Sexo: ");
		bil.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cerverjas: ");
		bil.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bil.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bil.barbecue = sc.nextInt();

		System.out.println();

		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", bil.feeding());
		if (bil.feeding() > 30) {
			System.out.println("Isento de Couvert");
		} else {
			System.out.printf("Couvert = R$ %.2f%n", bil.cover());

		}

		System.out.printf("Ingresso = R$ %.2f%n", bil.ticket());

		System.out.println();

		System.out.printf("Valor a pagar: R$ %.2f%n", bil.total());

	}

}
