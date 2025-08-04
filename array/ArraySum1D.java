public class ArraySum1D {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Example array
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Length of array: " + numbers.length);
    }
}
