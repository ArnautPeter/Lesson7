package ua.od.hillel;

import java.util.Scanner;

public class Ulan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size: ");

        int matrixSize = scanner.nextInt();
        int matrix[][] = new int[matrixSize][matrixSize];
        int i = matrixSize / 2;
        int j = matrixSize / 2;
        int rezult = 1;
        boolean downAndLeft = true;
        matrix[i][j] = rezult;
        int step = 1;

        while (true) {
            try {

                if (downAndLeft) {
                    int tempStepDown = step;
                    int tempStepLeft = step;
                    while (tempStepDown > 0) {
                        i++; 
                        rezult++;
                        matrix[i][j] = rezult;
                        tempStepDown--;
                    }
                    while (tempStepLeft > 0) {
                        j--;
                        rezult++;
                        matrix[i][j] = rezult;
                        tempStepLeft--;
                    }
                    downAndLeft = false;
                    step++;
                }

                if (!downAndLeft) {
                    int tempStepUp = step;
                    int tempStepRight = step;
                    while (tempStepUp > 0) {
                        i--;
                        rezult++;
                        matrix[i][j] = rezult;
                        tempStepUp--;
                    }
                    while (tempStepRight > 0) {
                        j++;
                        rezult++;
                        matrix[i][j] = rezult;
                        tempStepRight--;
                    }
                    downAndLeft = true;
                    step++;
                }

            } catch (Exception e) {
                System.out.println("Matrix: ");
                break;
            }
        }

        PrintMatrix.PrintMatrix(matrix);
    }
}
