import java.util.*;


public class basics {
    public static void main(String args[]){

        //Print 
        System.out.println("Hello Word");
        int a = 10;
        int b = 25;
        int c = 2*(a+b); 

        System.out.println(c);

        //Scanner
        System.out.print("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Your name is : "+ name);

        System.out.print("Enter value of X: ");
        int X = sc.nextInt();
        System.out.print("Enter value of Y: ");
        int Y = sc.nextInt();

        int Z = X+Y;
        System.out.println("X + Y =  " + Z);

        //Conditional  (if-else)
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("You Can Vote");
        }else{
            System.out.println("Sorry Better Luck Next time");
        }

        //Switch

        int button = sc.nextInt();
        switch (button) {
            case 1:System.out.println("Hello");
            break;

            case 2:System.out.println("Namaste");
            break;

            case 3:System.out.println("Radhe Radhe");
            break;
            
            default: System.out.println("Invalid Button");
                break;


        }

        //Loops

        
    }

    
}
