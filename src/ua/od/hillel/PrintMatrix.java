package ua.od.hillel;


public class PrintMatrix {

    public static void PrintMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                System.out.format(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
