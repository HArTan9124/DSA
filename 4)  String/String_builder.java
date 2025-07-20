//Strings in Java are immutable

import java.util.*;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HarTan");
        System.out.println(sb);

        //CharAt
        System.out.println(sb.charAt(0));

        //Set CharAt
        sb.setCharAt(0, 'h');
        System.out.println(sb);

        //insert
        sb.insert(3, "R");
        System.out.println("Inserted"+sb);

         //Delete
         sb.delete(3, 5);           //3rd will be deleted and it will go till 5
         System.out.println("Deleted "+ sb);
         
        //Append
        sb.append("n");
        System.out.println("Append "+ sb);

        //Reverse
        sb.reverse();
        System.out.println("Reverse "+ sb);

        
    }
}
