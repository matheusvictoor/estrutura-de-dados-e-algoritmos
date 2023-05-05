package com.eda.vetor;

import java.util.Arrays;

public class VetorObject {

    private Object[] elementos;
    private  int tamanho;

    public VetorObject(int capacidade){
        this.elementos = new Object[capacidade];
    }

    public void adiciona1(Object elemento){
    	aumentaCapacidade();
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == null){
                elementos[i] = elemento;
                tamanho++;
                break;
            }
        }
    }

    public void adiciona2(Object elemento){
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

    public Object buscaById(int posicao){
    	if(!(posicao >= 0 && posicao < tamanho)) {
    		throw new IllegalArgumentException("Posição inválida");
    	}
    	return elementos[posicao];
    }
    
    public int buscaByName(Object elemento) {
    	for(int i = 0; i < tamanho; i++) {
    		if(elementos[i].equals(elemento)) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    public boolean insereNaPosicao(int posicao, Object elemento) {
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
    		Object[] elementosNovos = new String[elementos.length * 2];
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
