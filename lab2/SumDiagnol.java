import java.util.Scanner;

public class SumDiagnol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        System.out.println("Enter a 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int leftDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            leftDiagonalSum += matrix[i][i];
        }

        int rightDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            rightDiagonalSum += matrix[i][2 - i];
        }

        // Print the results
        System.out.println("Matrix:");
        printMatrix(matrix);
        System.out.println("Sum of left diagonal elements: " + leftDiagonalSum);
        System.out.println("Sum of right diagonal elements: " + rightDiagonalSum);

        scanner.close();
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}