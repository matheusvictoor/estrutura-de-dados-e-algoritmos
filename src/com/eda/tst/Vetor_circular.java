package com.eda.tst;

import java.util.Scanner;

// Escreva um programa que imprime um vetor de maneira circular. Seu programa deve receber uma sequência de valores e um inteiro N
// e deve imprimir as N posições da sequência lida. Naturalmente, N pode ser maior do que o tamanho da sequência lida.
public class Vetor_circular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numeros = sc.nextLine().split(" ");
        int n = sc.nextInt();

        StringBuilder out = new StringBuilder();

        int cont = 1;
        int i = 0;

        while (cont <= n) {
            out.append(numeros[i]).append(" ");
            i++;
            if (i == numeros.length) i = 0;
            cont++;
        }

        System.out.println(out.toString().trim());
    }
}
