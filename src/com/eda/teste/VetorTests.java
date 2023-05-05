package com.eda.teste;

import com.eda.vetor.VetorObject;

public class VetorTests {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(5);

        vetor.adiciona2("elemento 1");
        vetor.adiciona2("elemento 2");
        vetor.adiciona2("elemento 3");
        vetor.adiciona2("elemento 4");
        vetor.adiciona2("elemento 5");
        vetor.adiciona2("elemento 6");
        

//        System.out.println(vetor.tamanho());
//        
//        System.out.println(vetor.toString());
//        
//        System.out.println(vetor.buscaById(1));
//        
//        System.out.println(vetor.buscaByName("elemento 2"));
        
//        System.out.println(vetor.insereNaPosicao(3, "elemento 4"));
        
        vetor.remover(4);
        
        System.out.println(vetor.toString());
        
    
    }
}
