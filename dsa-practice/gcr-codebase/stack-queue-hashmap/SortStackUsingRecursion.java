import java.util.*;
class SortStackUsingRecursion {
    Stack<Integer> stack;

    SortStackUsingRecursion() {
        stack = new Stack<>();
    }

    void sortedInsert(int value) {
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
            return;
        }
        int temp = stack.pop();
        sortedInsert(value);
        stack.push(temp);
    }

    void sortStack() {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack();
            sortedInsert(temp);
        }
    }

    void push(int value) {
        stack.push(value);
    }

    void printStack() {
        System.out.println(stack);
    }

    public static void main(String[] args) {
        SortStackUsingRecursion sortStack = new SortStackUsingRecursion();
        sortStack.push(30);
        sortStack.push(-5);
        sortStack.push(18);
        sortStack.push(14);
        sortStack.push(-3);

        System.out.println("Original Stack:");
        sortStack.printStack();

        sortStack.sortStack();

        System.out.println("Sorted Stack:");
        sortStack.printStack();
    }   
}
