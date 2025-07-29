import java.util.*;
public class pop {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        push(stack, 10);
        push(stack, 20);
        push(stack, 30);
        push(stack, 40);
        push(stack, 50);
        System.out.println("Stack elements are:");
        printStack(stack);
        pop(stack );
        System.out.println("Stack elements after popping are:");
        printStack(stack);
        int topElement = peek(stack);
        if (topElement != -1) {
            System.out.println("Top element is: " + topElement);
        }
    }
    public static void push(Stack<Integer> stack, int value) {
        stack.add(value);
    }
    public static void pop(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int top = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        System.out.println("Popped element is: " + top);
    }
    public static void printStack(Stack<Integer> stack) {
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }
    public static int peek(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return stack.get(stack.size() - 1);
    }
}
