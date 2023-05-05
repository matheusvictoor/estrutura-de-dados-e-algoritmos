package com.eda.tst;

import java.util.Scanner;

public class Stop_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] palavrasFrase = scanner.nextLine().split(" ");
        String[] stopwords  = scanner.nextLine().split(" ");

        String resultado = "";

        for (String palavra: palavrasFrase) {
            boolean remover = false;
            for (String sw: stopwords) {
                if (palavra.equals(sw)) {
                    remover = true;
                    break;
                }
            }
            if (!remover) {
                resultado += palavra + " ";
            }
        }

        System.out.println(resultado.trim());
    }
}

