package ua.od.hillel;


import java.util.Scanner;

public class Pascal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size > 2: ");

        int matrixSize = scanner.nextInt();
        int matrix[][] = new int[matrixSize][];
        matrix[0] = new int[1];
        matrix[1] = new int[2];
        matrix[0][0] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 1;


        for (int i = 2; i < matrix.length; i++) {
            matrix[i] = new int[i + 1];
            matrix[i][0] = 1;
            int j = 1;
            for (; j < matrix[i].length - 1; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
            }
            matrix[i][j] = 1;
        }

        //печатаем треугольник
        for (int i = 0; i < matrix.length; i++) {
            int space = matrix.length - i - 1;
            while (space != 0) {
                System.out.print(" ");
                space--;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

