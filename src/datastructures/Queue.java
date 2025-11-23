public class Queue {
    private int[] arr; private int head = 0, tail = 0, size = 0;
    public Queue(int capacity) { arr = new int[Math.max(2, capacity)]; }
    public void enqueue(int v) {
        if (size == arr.length) resize();
        arr[tail] = v; tail = (tail + 1) % arr.length; size++;
    }
    public int dequeue() {
        if (size == 0) throw new RuntimeException("Queue empty");
        int v = arr[head]; head = (head + 1) % arr.length; size--; return v;
    }
    public int size() { return size; }
    private void resize() {
        int[] b = new int[arr.length * 2];
        for (int i = 0; i < size; i++) b[i] = arr[(head + i) % arr.length];
        arr = b; head = 0; tail = size;
    }
}