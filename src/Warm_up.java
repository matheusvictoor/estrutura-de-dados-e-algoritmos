import java.util.Scanner;

// Escreva um programa que leia um número inteiro N e uma sequência de inteiros e multiplique cada elemento dessa sequência por N.

public class Warm_up {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] numeros = sc.nextLine().split(" ");
        String out = "";

        for(int i = 0; i < numeros.length; i++){
            out += Integer.toString(Integer.parseInt(numeros[i]) * n) + " ";
        }
        System.out.println(out.trim());
    }
}