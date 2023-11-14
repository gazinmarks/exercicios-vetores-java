package application;


import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.

public class Exercicio4 {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n, evenQuantity;

        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        evenQuantity = 0;
        System.out.println("\nNúmeros pares: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d ", vect[i]);
                evenQuantity++;
            }
        }

        System.out.printf("\nQuantidade de pares: %d", evenQuantity);

    }
}
