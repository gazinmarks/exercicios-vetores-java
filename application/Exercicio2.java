package application;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum, media;

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        sum = 0.0;
        for (double v : vect) {
            sum += v;
        }

        media = sum / n;

        System.out.println();

        System.out.print("Valores: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }


        System.out.printf("\nSoma: %.2f%n", sum);

        System.out.printf("Média: %.2f%n", media);
    }
}
