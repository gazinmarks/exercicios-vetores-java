package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um número inteiro N e uma matriz de ordem N
// contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade
// de valores negativos da matriz.


public class Exercicio14 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {  // matriz.lenght para percorrer as linhas do vetor
            for (int j = 0; j < matriz[i].length; j++) {  // matriz[i].lenght para percorrer as colunas do vetor
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i]);
        }


        System.out.println("\nNegative numbers");
        int negative = 0;
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                if (anInt < 0) {
                    negative++;
                }
            }

        }

        System.out.println(negative);

    }
}
