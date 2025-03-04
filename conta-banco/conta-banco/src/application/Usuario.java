package application;

import java.util.Scanner;

import entities.ContaBanco;

public class Usuario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Por favor digite o numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Por favor digite a agencia: ");
		String agencia = sc.nextLine();
		System.out.print("Por favor digite o nome do cliente: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Por favor digite o saldo: ");
		double saldo = sc.nextDouble();
				
		ContaBanco contaBanco = new ContaBanco(numero, agencia, nomeCliente, saldo);
		
		System.out.println(contaBanco.toString());
		
		sc.close();
		
	}

}