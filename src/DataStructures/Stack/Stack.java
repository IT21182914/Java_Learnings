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
        if (top == maxSize - 1)
            System.out.println("Stack is full");
        else
            stackArray[++top] = j;
        System.out.println(j + " was pushed to the stack");
    }

    public int pop() {
        if (top == -1)
            return -99;
        else
            return stackArray[top--];
    }

    public int peek() {
        if (top == -1)
            return -99;
        else
            return stackArray[top];
    }

}
