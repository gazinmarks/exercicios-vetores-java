package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.

public class Exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextInt();
        }

        System.out.println("Vetor Resultante: ");

        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.printf("%d\n", vectC[i]);
        }


    }
}
