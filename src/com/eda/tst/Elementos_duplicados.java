package com.eda.tst;

import java.util.Scanner;

public class Elementos_duplicados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");
        boolean out = false;

        for (int i = 0; i < entrada.length; i++) {
            for (int j = 1 + i; j < entrada.length; j++) {
                if (entrada[i].equals(entrada[j]))
                    out = true;
            }
        }
        System.out.println(out);
    }
}
