import java.util.*;

public class TwoD_array {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                arr[x][y] = sc.nextInt();
            }
        }
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }

}
