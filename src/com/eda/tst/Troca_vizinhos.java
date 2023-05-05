package com.eda.tst;

import java.util.Arrays;
import java.util.Scanner;

// Escreva um programa que leia uma sequência de números inteiros e troca os elementos vizinhos.
// Se o tamanho da sequência for impar, troque os vizinhos e mantenha o último elemento em sua posição.

public class Troca_vizinhos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numeros = sc.nextLine().split(" ");

        for (int i = 0; i <= numeros.length - 2; i+=2){
            String aux = numeros[i];
            numeros[i] = numeros[i+1];
            numeros[i+1] = aux;
        }

        System.out.println(Arrays.toString(numeros));
    }
}
