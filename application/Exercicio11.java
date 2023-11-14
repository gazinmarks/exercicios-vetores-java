package application;

import entities.PessoaExercicio11;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, quantityWoman, quantityMen;
        double height, higherHeight, shorterHeight, averageHeightWoman;
        char gender;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();


        PessoaExercicio11[] vect = new PessoaExercicio11[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            height = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ", i + 1);
            gender = sc.next().charAt(0);

            vect[i] = new PessoaExercicio11(height, gender);
        }

        higherHeight = 0;
        shorterHeight = 0;
        // TENTANDO IMPLEMENTAR LISTA ORDENADA POR CONTA PROPRIA
        for (int i = 0; i < vect.length - 1; i++) {
            for (int j = 0; j < vect.length - 1 - i; j++) {
                PessoaExercicio11 aux = vect[j];
                if (vect[j].getHeight() > vect[j + 1].getHeight()) {
                    vect[j] = vect[j + 1];
                    vect[j + 1] = aux;
                }
                higherHeight = vect[i + 1].getHeight();
                shorterHeight = vect[0].getHeight();
            }

        }

        quantityMen = 0;
        quantityWoman = 0;
        averageHeightWoman = 0;
        for (int i = 0; i < vect.length; i++) {
            PessoaExercicio11 person = vect[i];
            if (person.getGender() == 'F') {
                averageHeightWoman += person.getHeight();
                quantityWoman++;
            } else {
                quantityMen++;
            }
        }

        averageHeightWoman = averageHeightWoman / quantityWoman;

        System.out.printf("Menor altura: %.2f\n", shorterHeight);
        System.out.printf("Maior altura: %.2f\n", higherHeight);
        System.out.printf("Média das alturas das mulheres: %.2f\n", averageHeightWoman);
        System.out.printf("Número de homens: %d", quantityMen);

        sc.close();
    }


}



