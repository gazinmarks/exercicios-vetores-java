package application;

import entities.PessoaExercicio9;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.

public class Exercicio9 {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, age, olderAgePerson;
        String name, olderNamePerson;

        System.out.print("Quantas pessoas você vai digitar? ");

        n = sc.nextInt();

        PessoaExercicio9[] vect = new PessoaExercicio9[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Idade: ");
            age = sc.nextInt();

            vect[i] = new PessoaExercicio9(name, age);
        }

        olderAgePerson = vect[0].getAge();
        olderNamePerson = null;

        for (int i = 0; i < vect.length; i++) {
            PessoaExercicio9 person = vect[i];
            if (person.getAge() > olderAgePerson){
                olderAgePerson = vect[i].getAge();
                olderNamePerson = person.toString();
            }
        }

        System.out.printf("Pessoa mais velha: %s", olderNamePerson);
    }
}
