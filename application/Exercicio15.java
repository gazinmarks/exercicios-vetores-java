package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler dois números inteiros M e N, e depois ler
// uma matriz de M linhas por N colunas contendo números inteiros,
// podendo haver repetições. Em seguida, ler um número inteiro X
// que pertence a matriz. Para cada ocorrência de X, mostrar os valores
// à esquerda, acima, abaixo, e à direita de X, quando houver.


public class Exercicio15 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int m = sc.nextInt();
        System.out.print("Digite o número de colunas: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Digite os números da matriz: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[] aroundNums = new int[4];
        int num = sc.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == num) {
                    System.out.print("Position: " + i + ", " + j);
                    if (j > 0) {
                        aroundNums[0] = mat[i][j - 1];
                    }
                    if (i > 0) {
                        aroundNums[1] = mat[i][j + 1];
                    }
                    if (j < mat[i].length) {
                        aroundNums[2] = mat[i - 1][j];
                    }
                    if (i < mat.length - 1) {
                        aroundNums[3] = mat[i + 1][j];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(aroundNums));

    }
}
