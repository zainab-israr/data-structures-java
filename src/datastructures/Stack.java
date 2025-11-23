import java.util.Arrays;

public class Stack {
    private int[] arr; private int top = -1;
    public Stack() { arr = new int[8]; }
    public void push(int v) {
        if (top + 1 == arr.length) arr = Arrays.copyOf(arr, arr.length * 2);
        arr[++top] = v;
    }
    public int pop() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        return arr[top--];
    }
    public int peek() { if (isEmpty()) throw new RuntimeException("Empty"); return arr[top]; }
    public boolean isEmpty() { return top == -1; }
}