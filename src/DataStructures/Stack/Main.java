package DataStructures.Stack;

public class Main {

    public static void main(String[] args) {

        Stack stack1 = new Stack(5);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);

        Stack stack2 = new Stack(5);

        // Transfer elements from stack1 to stack2
        while (!stack1.isEmpty()) {
            int element = stack1.pop();
            stack2.push(element);
            System.out.println("Popped " + element + " from stack1 and pushed into stack2");
        }

        System.out.println("Elements in stack2 after transferring from stack1:");
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    }
}
