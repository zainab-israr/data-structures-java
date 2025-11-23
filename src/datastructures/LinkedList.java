public class LinkedList {
    private static class Node {
        int data; Node next;
        Node(int d) { data = d; }
    }
    private Node head;

    public void insertAtHead(int val) {
        Node n = new Node(val); n.next = head; head = n;
    }
    public void insertAtTail(int val) {
        Node n = new Node(val);
        if (head == null) { head = n; return; }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = n;
    }
    public boolean delete(int val) {
        if (head == null) return false;
        if (head.data == val) { head = head.next; return true; }
        Node cur = head;
        while (cur.next != null && cur.next.data != val) cur = cur.next;
        if (cur.next == null) return false;
        cur.next = cur.next.next; return true;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = head;
        while (cur != null) {
            sb.append(cur.data).append(" -> ");
            cur = cur.next;
        }
        sb.append("null");
        return sb.toString();
    }
}