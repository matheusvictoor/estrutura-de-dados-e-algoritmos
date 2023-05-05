package com.eda.vetor;

import java.util.Arrays;

public class VetorGenerics<T> {

    private T[] elementos;
    private  int tamanho;

    public VetorGenerics(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona1(T elemento){
    	aumentaCapacidade();
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == null){
                elementos[i] = elemento;
                tamanho++;
                break;
            }
        }
    }

    public void adiciona2(T elemento){
    	aumentaCapacidade();
       if (tamanho < elementos.length){
           elementos[tamanho] = elemento;
           tamanho++;
       } else {
           throw new RuntimeException("Vetor já está cheio");
       }
    }

    public int tamanho(){
        return tamanho;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < tamanho - 1; i++){
            s.append(elementos[i]);
            s.append(", ");
        }
        if (tamanho > 0)
            s.append(elementos[tamanho - 1]);

        s.append("]");

        return s.toString();
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
    
    public boolean insereNaPosicao(int posicao, T elemento) {
    	if(!(posicao >= 0 && posicao < tamanho)) {
    		throw new IllegalArgumentException("Posição inválida");
    	}
    	
    	aumentaCapacidade();
    	
    	for(int i = tamanho; i >= posicao; i--) {
    		elementos[i+1] = elementos[i];
    	}
    	elementos[posicao] = elemento;
    	tamanho++;
    	
    	return false;
    }
    
    private void aumentaCapacidade() {
    	if(tamanho == elementos.length) {
    		T[] elementosNovos = (T[]) new Object[elementos.length * 2];
	    	for(int i = 0; i < elementos.length; i++) {
	    		elementosNovos[i] = elementos[i];
	    	}
	    	elementos = elementosNovos;
    	}
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
