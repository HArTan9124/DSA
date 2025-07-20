import java.util.Scanner;

public class one_right {
    public static void main(String[] args) {
        System.out.println("Enter Dimensions:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        System.out.println("Enter Your Elements:");
        int[][] arr = new int[row][column];
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                arr[x][y] = sc.nextInt();
            }
        }

        System.out.println("Your Array is:");
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }

        System.out.println("90 Degree Clockwise Rotated Array:");
        for (int j = 0; j < column; j++) {
            for (int i = row - 1; i >= 0; i--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
