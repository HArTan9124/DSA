public class Quicksort {

    public static void quickSort(int[] nums , int low , int high ){
        if (low<high) {

            int pi = partition(nums,low,high);

            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }
    }

    public static int partition(int[] nums, int low , int high ){
        int pivot = nums[high];
        int i = low -1;

        for(int j=low;j<high;j++){
            if (nums[j]<pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;

        return i+1;
    }
    public static void main(String[] args) {
        int nums[] = { 9, 4, 2, 7, 5, 8, 1, 0, 3, 6};
        
        quickSort(nums , 0 , nums.length-1);



        for(int num : nums){
            System.out.print(num + " ");
        }
    }   
}
