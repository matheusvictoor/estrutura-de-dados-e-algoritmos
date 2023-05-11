package com.eda.sequenciais;

import com.eda.base.EstruturaEstatica;

public class ArrayList<T> extends EstruturaEstatica<T> {

    private T[] elementos;
    private  int tamanho;
    
    public ArrayList() {
    	super();
    }

    public ArrayList(int capacidade){
       super(capacidade);
    }
  
    public void adiciona(T elemento) {
    	super.adiciona(elemento);
    }
    
    public boolean insereNaPosicao(int posicao, T elemento) {
    	return super.insereNaPosicao(tamanho, elemento);
    }

    public T buscaById(int posicao){
    	if(!(posicao >= 0 && posicao < tamanho)) {
    		throw new IllegalArgumentException("Posição inválida");
    	}
    	return elementos[posicao];
    }
    
    public int buscaByName(T elemento) {
    	for(int i = 0; i < tamanho; i++) {
    		if(elementos[i].equals(elemento)) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    public void remover(int posicao) {
    	if(!(posicao >= 0 && posicao < tamanho)) {
    		throw new IllegalArgumentException("Posição inválida");
    	}
    	
    	for(int i = posicao; i < tamanho - 1; i++) {
    		elementos[i] = elementos[i+1];
    	}
    	tamanho--;
    }
}
