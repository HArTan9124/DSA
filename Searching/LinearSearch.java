import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int num[] = {5,7,9,11,13,15,17};
        int target = 11;

        int reasult = linearSearch(num , target);

        if (reasult != 1) {
            System.out.println("Element found at Index " + reasult);
        }else{
            System.out.println("Element not found");
        }
        
    }

    public static int linearSearch(int[] num , int target){
        for(int i=0;i<num.length;i++){
            if (num[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
