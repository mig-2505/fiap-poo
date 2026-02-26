package br.com.fiap.model;

public class Mochila {
	
	public int tamanho;
	public String material;
	public double peso;
	public boolean aberto;
	public boolean fechado;
	
	
	public Mochila(String material, boolean aberto, boolean fechado) {
		this.tamanho = 0;
		this.material = material;
		this.peso = 0;
		this.aberto = aberto;
		this.fechado = fechado;
	}
	
	public void abrirMochila(boolean aberto) {
		if (aberto) {
			System.out.println("Abrindo mochila");
			return;
		}
		if(aberto == false) {
			System.out.println("Não abrindo mochila");
			return;
		}
	}
	
	public void fecharMochila(boolean fechado) {
		if (fechado) {
			System.out.println("Fechando mochila");
			return;
		}
		if(fechado == false) {
				System.out.println("Não fechando mochila");
				return;
		}
		
	}
}
