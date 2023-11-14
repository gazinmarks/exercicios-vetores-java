package application;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"

public class Exercicio8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, quantityEven;
        double average;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        average = 0;
        quantityEven = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                average += vect[i];
                quantityEven++;
            }

        }

        if (average == 0) {
            System.out.println("Nenhum número par");
        } else {

            average = average / quantityEven;

            System.out.printf("\nMédia dos pares: %.1f", average);
        }

    }
}
