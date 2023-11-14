package application;

import entities.PessoaExercicio3;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

public class Exercicio3 {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, age;
        String name;
        double height, average, sumAverageHeight, personUnder16;

        System.out.print("Quantas pessoas serão digitadas: ");
        n = sc.nextInt();

        PessoaExercicio3[] vect = new PessoaExercicio3[n];


        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Idade: ");
            age = sc.nextInt();
            System.out.print("Altura: ");
            height = sc.nextDouble();

            vect[i] = new PessoaExercicio3(name, age, height);
        }

        average = 0;
        for (int i = 0; i < vect.length; i++) {
            PessoaExercicio3 person = vect[i];
            average += person.getHeight();
        }

        sumAverageHeight = average / n;

        personUnder16 = 0;
        for (int i = 0; i < vect.length; i++) {
            PessoaExercicio3 person = vect[i];
            if (person.getAge() < 16) {
                personUnder16 = i;
            }
        }

        personUnder16 = (personUnder16 / n) * 100;

        System.out.printf("Altura média: %.2f", sumAverageHeight);
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%s", personUnder16, "%");

        for (int i = 0; i < vect.length; i++) {
            PessoaExercicio3 person = vect[i];
            if (person.getAge() < 16) {
                System.out.printf("\n%s", person.getName());
            }
        }

        sc.close();
    }
}
