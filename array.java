


import java.util.*;


public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = scanner.nextInt();

        float[] marks = new float[n];

        System.out.println("Enter the marks of " + n + " students: ");
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextFloat();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i] + " marks");
        }

        System.out.printf("Average = %.2f\n", calculateAverage(marks, n));
    }

    private static double calculateAverage(float[] marks, int n) {
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }
        return sum / n;
    }

    @Override
    public String toString() {
        return "array{}";
    }
}