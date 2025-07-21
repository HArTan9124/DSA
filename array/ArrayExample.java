public class ArrayExample {
    // public static void main(String[] args) {
    //     int[] numbers = {10, 20, 30, 40, 50};

    //     System.out.println("First element: " + numbers[0]); 
    //     numbers[1] = 25;
    //     System.out.print("Modified array: ");
    //     for (int num : numbers) {
    //         System.out.print(num + " ");
    //     }
    //     System.out.println();

    //     for (int num : numbers) {
    //         System.out.println(num);
    //     }
    //}


    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int[] copy = numbers.clone();
        numbers[0] = 100;
        System.out.println("Original array: ");
        for(int num : numbers) {
            System.out.print(num + " ");

        }
        
    }
}