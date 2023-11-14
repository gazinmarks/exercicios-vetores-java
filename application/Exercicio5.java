package application;

import java.util.Locale;
import java.util.Scanner;

//        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//        considerando a primeira posição como 0 (zero).

public class Exercicio5 {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double higherNumber = vect[0];
        int positionHigherNumber = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > higherNumber) {
                higherNumber = vect[i];
                positionHigherNumber = i;
            }
        }

        System.out.printf("Maior valor: %.1f", higherNumber);
        System.out.printf("\nPosição do maior valor: %d", positionHigherNumber);

    }
}
