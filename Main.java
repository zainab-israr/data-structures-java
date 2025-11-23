public class Main {
    public static void main(String[] args) {
        System.out.println("DSA-Java Demo\n");

        // Sorting demo
        int[] a = {5,2,9,1,5,6};
        System.out.println("Original: " + Arrays.toString(a));
        Sorting.quickSort(a);
        System.out.println("QuickSorted: " + Arrays.toString(a));

        // Searching demo
        int idx = Searching.binarySearch(a, 5);
        System.out.println("Index of 5 in sorted array: " + idx);

        // LinkedList demo
        LinkedList ll = new LinkedList();
        ll.insertAtTail(10); ll.insertAtTail(20); ll.insertAtHead(5);
        System.out.println("LinkedList: " + ll);

        // Stack demo
        Stack st = new Stack(); st.push(3); st.push(7); System.out.println("Stack pop: " + st.pop());

        // Queue demo
        Queue q = new Queue(4); q.enqueue(1); q.enqueue(2); q.enqueue(3); System.out.println("Queue dequeue: " + q.dequeue());

        // BinaryTree demo
        BinaryTree bt = new BinaryTree();
        for (int i = 1; i <= 7; i++) bt.insert(i);
        System.out.print("Tree inorder: "); bt.inorder();
        System.out.print("Tree level-order: "); bt.levelOrder();

        // Graph demo
        Graph g = new Graph(6);
        g.addEdge(0,1); g.addEdge(0,2); g.addEdge(1,3); g.addEdge(2,4); g.addEdge(2,5);
        System.out.println("BFS from 0: " + g.bfs(0));
        System.out.println("DFS from 0: " + g.dfs(0));

        System.out.println("\nDemo complete. See README for compilation and running instructions.");
    }
}