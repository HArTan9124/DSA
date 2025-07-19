import java.util.Scanner;

public class find_inTwoD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        System.out.println("Enter the elements:");
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                arr[x][y] = sc.nextInt();
            }
        }

        System.out.println("Here is your array:");
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }

        System.out.print("Tell the element you want to find: ");
        int num = sc.nextInt();

        boolean found = false;

        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                if (num == arr[x][y]) {
                    int p = x+1 ;
                    int q = y+1;
                    System.out.println("Your number is at position " + p+ "th row and " + q + "th column.");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Your number is not in the array.");
        }

        sc.close();
    }
}
