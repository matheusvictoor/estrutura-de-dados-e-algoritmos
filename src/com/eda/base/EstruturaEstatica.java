package com.eda.base;

public class EstruturaEstatica<T> {

	protected T[] elementos;
	protected int tamanho;
	
	public EstruturaEstatica(int capacidade){
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public EstruturaEstatica() {
		this(10);
	}
	
	protected void adiciona(T elemento){
    	aumentaCapacidade();
       if (tamanho < elementos.length){
           elementos[tamanho] = elemento;
           tamanho++;
       } else {
           throw new RuntimeException("Vetor já está cheio");
       }
    }
	
	protected boolean insereNaPosicao(int posicao, T elemento) {
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
	
	protected void aumentaCapacidade() {
    	if(tamanho == elementos.length) {
    		T[] elementosNovos = (T[]) new Object[elementos.length * 2];
	    	for(int i = 0; i < elementos.length; i++) {
	    		elementosNovos[i] = elementos[i];
	    	}
	    	elementos = elementosNovos;
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
    
    public boolean estaVazia() {
		if(tamanho == 0)
			return true;
		return false;
			
	}
}
