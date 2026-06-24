public class binarySearch {
    
    public static void main(String[] args) {
        int num[] = {5,7,9,11,13,15,17};
        int target = 17;

        int reasult = BinarySearch(num , target);

        if (reasult != 1) {
            System.out.println("Element found at Index " + reasult);
        }else{
            System.out.println("Element not found");
        }
        
    }

    public static int BinarySearch(int[] num , int target){
        int left = 0;
        int right = num.length -1;

        while (left <= right) {
            int mid = (left + right)/2;

            if(num[mid] ==  target){
                return mid;
            } else if (num[mid]<target) {
                left = mid +1;
                
            }else{
                right = mid -1;
            }
        }
        return -1;
    }
}
