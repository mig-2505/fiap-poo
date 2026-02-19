package br.com.fiap.main;

import br.com.fiap.model.Mochila;

public class SistemaPrincipal {

	public static void main(String[] args) {

		Mochila mochila1 = new Mochila();

		mochila1.material = "Nylon";
		mochila1.peso = 5;
		mochila1.tamanho = 5;

		Mochila mochila2 = new Mochila();

		mochila2.material = "Couro";
		mochila2.peso = 3;
		mochila2.tamanho = 2;

		System.out.println("==== Mochilas ====");
		System.out.println();

		System.out.println("Minha mochila é feita de " + mochila1.material);
		System.out.println("Minha mochila pesa " + mochila1.peso + " Kilos");
		System.out.println("Minha mochila tem " + mochila1.tamanho + " metros");

		System.out.println();
		System.out.println("Minha mochila é feita de " + mochila1.material);
		System.out.println("Minha mochila pesa " + mochila1.peso + " Kilos");
		System.out.println("Minha mochila tem " + mochila1.tamanho + " metros");

	}

}
