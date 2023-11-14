package application;

import entities.MediaPreco;

import java.util.Locale;
import java.util.Scanner;

public class MediaDePrecos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        MediaPreco[] vect = new MediaPreco[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new MediaPreco(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            MediaPreco mediaPreco = vect[i];
            sum += mediaPreco.getPrice();
        }

        double average = sum / vect.length;

        System.out.printf("Average price: $ %.2f%n", average);
    }
}
