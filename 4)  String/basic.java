import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        // String FullName = sc.nextLine();
        // System.out.println("Your name is : " + FullName);


        //concatination   ( Joining two strings)

        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String Fullname = firstName +" "+ lastName;
        System.out.println("Your Full name is : " + Fullname);


        //chatAt

        for(int i=0;i<firstName.length();i++){
            System.out.println(Fullname.charAt(i));
        }
    }
}
