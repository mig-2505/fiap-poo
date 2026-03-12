package br.com.fiap.main;

import br.com.fiap.model.Mochila;

public class SistemaPrincipal {

	public static void main(String[] args) {

		Mochila mochila1 = new Mochila("Nylon", true, false);

		mochila1.peso = 5;
		mochila1.tamanho = 5;

		Mochila mochila2 = new Mochila("Couro", false, true);

		mochila2.peso = 3;
		mochila2.tamanho = 2;

		System.out.println("==== Mochilas ====\n");

		System.out.println("Minha mochila é feita de " + mochila1.material);
		System.out.println("Minha mochila pesa " + mochila1.peso + " Kilos");
		System.out.println("Minha mochila tem " + mochila1.tamanho + " metros\n");
		
		System.out.println("Abrindo mochila 1");
		mochila1.abrirMochila(true);
		System.out.println("Fechando mochila 1");
		mochila1.fecharMochila(true);
		
		System.out.println();
		
		System.out.println("Minha mochila é feita de " + mochila2.material);
		System.out.println("Minha mochila pesa " + mochila2.peso + " Kilos");
		System.out.println("Minha mochila tem " + mochila2.tamanho + " metros\n");
		
		System.out.println("Abrindo mochila 2");
		mochila2.abrirMochila(false);
		System.out.println("Fechando mochila 2");
		mochila2.fecharMochila(false);
		

	}

}
