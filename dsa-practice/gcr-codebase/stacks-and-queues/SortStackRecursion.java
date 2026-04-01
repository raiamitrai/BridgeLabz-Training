package dsa.stacksandqueues;

import java.util.Stack;

class SortStackRecursion {

    // Function to sort the stack
    static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();          // Step 1
        sortStack(stack);               // Step 2
        insertSorted(stack, top);       // Step 3
    }

    // Insert element in sorted order
    static void insertSorted(Stack<Integer> stack, int value) {

        // Base condition
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        insertSorted(stack, value);
        stack.push(temp);
    }

    // Main method
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}

