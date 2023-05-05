package com.eda.pilha;

import com.eda.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
	
	public Pilha() {
		super(10);
	}
	
	public void empilhar(T elemento) {
		super.adiciona(elemento);
	}
	
	public int tamanho() {
		return super.tamanho;
	}
	
	public T topo() {
		if(super.estaVazia())
			return null;
		return super.elementos[super.tamanho-1];
	}
	
	public T desempilha() {
		if(super.estaVazia())
			throw new IllegalArgumentException("A pilha está vazia");	
		return super.elementos[tamanho--];
	}
}
