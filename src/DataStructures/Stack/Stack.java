package DataStructures.Stack;

public class Stack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int j) {
        // check whether stack is full
        if (isFull()) {
            System.out.println("Stack is full, cannot push " + j);
        } else {
            stackArray[++top] = j;
            System.out.println(j + " was pushed to the stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop");
            return -99; // Or throw an exception
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, no top element");
            return -99; // Or throw an exception
        } else {
            return stackArray[top];
        }
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
