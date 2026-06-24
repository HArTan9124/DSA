import java.util.*;

public class basic {
    public static void add(Integer a , Integer b){
        Scanner sc = new Scanner(System.in);
        int c = a + b;
        System.out.println("Your Sum is " + c);
        return;
    }

    public static void subtract(Integer a , Integer b){
        Scanner sc = new Scanner(System.in);
        int c = a - b;
        System.out.println("Your Sum is " + c);
        return;
    }

    public static void multiply(Integer a , Integer b){
        Scanner sc = new Scanner(System.in);
        int c = a * b;
        System.out.println("Your Sum is " + c);
        return;
    }

    public static void devide(Integer a , Integer b){
        Scanner sc = new Scanner(System.in);
        int c = a % b;
        System.out.println("Your Sum is " + c);
        return;
    }

    
    public static void main(String[] args) {
        System.out.println("Enter Your numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println("Enter your choice \n1)  add \n2) subtract \n3) multiply \n4) devide");
        int i = sc.nextInt();
        if (i==1) {
                add(x,y);
        }else if (i==2) {
                subtract(x,y);
        }else if (i==3) {
                multiply(x,y);
        }else if (i==4) {
                devide(x,y);
        }else{
                System.out.println("Wrong choice");
        }
        sc.close();
    }
}


