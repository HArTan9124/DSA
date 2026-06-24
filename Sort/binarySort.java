public class binarySort {
    public static void main(String[] args) {

        int nums[] = { 9,4,2,7,5,8,1,0,3,6};
        int size = nums.length;
        int temp = 0;

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");

            }

        }
        System.out.println();
        System.out.println("after Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
