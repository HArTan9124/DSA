import java.util.*;

public class Multiplication_TwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input First Matrix
        System.out.println("Enter dimensions for Matrix 1 (rows and columns): ");
        int row1 = sc.nextInt();
        int column1 = sc.nextInt();

        int[][] arr1 = new int[row1][column1];
        System.out.println("Enter elements of Matrix 1:");
        for (int x = 0; x < row1; x++) {
            for (int y = 0; y < column1; y++) {
                arr1[x][y] = sc.nextInt();
            }
        }

        // Input Second Matrix
        System.out.println("Enter dimensions for Matrix 2 (rows and columns): ");
        int row2 = sc.nextInt();
        int column2 = sc.nextInt();

        int[][] arr2 = new int[row2][column2];
        System.out.println("Enter elements of Matrix 2:");
        for (int a = 0; a < row2; a++) {
            for (int b = 0; b < column2; b++) {
                arr2[a][b] = sc.nextInt();
            }
        }

        if (column1 != row2) {
            System.out.println("Multiplication not possible. Column of Matrix 1 must equal Row of Matrix 2.");
        } else {
            int[][] result = new int[row1][column2];

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    for (int k = 0; k < column1; k++) {
                        result[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            
            System.out.println("Result of Matrix Multiplication:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
