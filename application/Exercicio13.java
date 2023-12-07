package application;

import entities.PessoaExercicio13;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double percentage;


        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<PessoaExercicio13> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("\nEmployee #%d", i + 1);
            System.out.print("\nId: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new PessoaExercicio13(name, id, salary));
        }


        System.out.print("\nEnter the employee Id that will have salary increase: ");
        int id = sc.nextInt();
        PessoaExercicio13 employee = list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
        if (employee == null) {
            System.out.println("This Id doesn't exist!");
        } else {
            System.out.print("Enter the percentage: ");
            percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }

        System.out.println("\nList of employees: ");
        for (PessoaExercicio13 emp : list) {
            System.out.println(emp);
        }

        sc.close();

    }


}
