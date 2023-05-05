package com.eda.teste;

import com.eda.pilha.Pilha;

public class PilhaTests {

	public static void main(String[] agrs) {
		
		Pilha<Integer> pilha = new Pilha<>();
		
		for(int i = 1; i <= 144; i+=12) {
			pilha.empilhar(i);
		}

		System.out.println(pilha.tamanho());
		System.out.println(pilha);
		System.out.println(pilha.desempilha());
		System.out.println(pilha);
		System.out.println(pilha.topo());
	}
}
