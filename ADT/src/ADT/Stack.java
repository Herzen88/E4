package ADT;

public class Stack {
    private int maxSize;
    private int top;
    private char[] stackArray;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char j) {
        if (isFull()) {
            System.out.println("The stack is full!");
        } else {
            top++;
            stackArray[top] = j;
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return 'O';
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public char peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }
}
