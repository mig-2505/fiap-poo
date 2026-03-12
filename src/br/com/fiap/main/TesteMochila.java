package br.com.fiap.main;

import br.com.fiap.model.Mochila;

public class TesteMochila {

	public static void main(String[] args) {

		Mochila mochila1 = new Mochila("Nylon", 5, 5, true, false);

		Mochila mochila2 = new Mochila("Couro", 2, 3, false, true);


		System.out.println("==== Mochilas ====\n");

		System.out.println("Minha mochila é feita de " + mochila1.getMaterial());
		System.out.println("Minha mochila pesa " + mochila1.getPeso() + " Kilos");
		System.out.println("Minha mochila tem " + mochila1.getTamanho() + " metros\n");
		
		System.out.println("Abrindo mochila 1");
		mochila1.abrirMochila(true);
		System.out.println("Fechando mochila 1");
		mochila1.fecharMochila(true);
		
		System.out.println();
		
		System.out.println("Minha mochila é feita de " + mochila2.getMaterial());
		System.out.println("Minha mochila pesa " + mochila2.getPeso() + " Kilos");
		System.out.println("Minha mochila tem " + mochila2.getTamanho() + " metros\n");
		
		System.out.println("Abrindo mochila 2");
		mochila2.abrirMochila(false);
		System.out.println("Fechando mochila 2");
		mochila2.fecharMochila(false);
		

	}

}
