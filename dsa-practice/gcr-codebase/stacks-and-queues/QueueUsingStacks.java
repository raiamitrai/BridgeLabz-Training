package dsa.stacksandqueues;
import java.util.Stack;

class QueueUsingStacks {

    Stack<Integer> stack1 = new Stack<>(); // enqueue
    Stack<Integer> stack2 = new Stack<>(); // dequeue

    // Enqueue operation
    public void enqueue(int x) {
        stack1.push(x);
        System.out.println("Enqueued: " + x);
    }

    // Dequeue operation
    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Transfer elements if stack2 is empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Peek front element
    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    // Check if empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Main method
    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
    }
}

