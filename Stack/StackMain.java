import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        stack.push("Fifth");
        stack.push("Sixth");

        String lastone = stack.pop();
        


        System.out.println("Stack contents: " + stack);
        System.out.println("Last one is "+lastone);
        System.out.println("TOP one is " + stack.peek() );

        System.out.println(stack.search(lastone)); //if someethins is now found inn stack it will return -1
        
    }
}
