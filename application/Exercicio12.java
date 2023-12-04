package application;

import entities.PessoaExercicio12;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name, email;
        int room;

        PessoaExercicio12[] vect = new PessoaExercicio12[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("\nRent #%d", i + 1);
            System.out.print("\nName: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            room = sc.nextInt();

            vect[room] = new PessoaExercicio12(name, email);
        }

        System.out.print("\nBusy rooms: ");
        for (int i = 0; i < vect.length; i++) {
            PessoaExercicio12 person = vect[i];
            if (vect[i] != null) {
                System.out.printf("\n%d: %s", i, person);
            }
        }

    }
}
