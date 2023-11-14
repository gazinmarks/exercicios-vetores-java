package application;

import java.util.Locale;
import java.util.Scanner;

// PROGRAMA PARA LER UMA QUANTIDADE DE NÚMEROS DE ALTURA E TIRAR A MÉDIA DELES;

public class MediaDeAltura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        double average = sum / vect.length;

        System.out.printf("Average: %.2f%n", average);

    }
}
