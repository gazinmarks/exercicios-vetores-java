package application;

import entities.PessoaExercicio10;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).

public class Exercicio10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        String name;
        int n;
        double firstNote, secondNote, sumNotes;

        System.out.print("Quantos alunos serão digitados: ");
        n = sc.nextInt();

        PessoaExercicio10[] vect = new PessoaExercicio10[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e a segunda nota do %do aluno: \n", i + 1);
            name = sc.nextLine();
            firstNote = sc.nextDouble();
            secondNote = sc.nextDouble();

            vect[i] = new PessoaExercicio10(name, firstNote, secondNote);
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < vect.length; i++) {
            PessoaExercicio10 person = vect[i];
            sumNotes = (person.getFirstNote() + person.getSecondNote()) / 2;
            if (sumNotes >= 6){
                System.out.printf("%s\n", person);
            }

        }



    }
}
