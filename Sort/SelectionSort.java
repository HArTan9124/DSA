public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = { 9, 4, 2, 7, 5, 8, 1, 0, 3, 6 };
        int size = nums.length;
        int temp = 0;
        int minInd = -1;
        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < size - 1; i++) {
            minInd = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minInd] > nums[j]) {
                    minInd = j;
                }
            }
            temp = nums[minInd];
            nums[minInd] = nums[i];
            nums[i] = temp;
            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }      
        }
        System.out.println("\nafter Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
