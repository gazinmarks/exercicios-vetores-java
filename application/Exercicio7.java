package application;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

public class Exercicio7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double average, totalAverage;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        average = 0;
        for (int i = 0; i < vect.length; i++) {
            average += vect[i];
        }

        totalAverage = average / n;

        System.out.printf("Média do vetor: %.3f", totalAverage);

        System.out.println("\nElementos abaixo da média: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < totalAverage) {
                System.out.printf("%.1f\n", vect[i]);
            }
        }


    }
}
