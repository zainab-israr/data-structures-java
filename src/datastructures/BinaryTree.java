import java.util.*;

public class BinaryTree {
    static class Node { int val; Node left, right; Node(int v){val=v;} }
    private Node root;

    // Insert as in level order to keep tree reasonably balanced (for demo)
    public void insert(int v) {
        Node n = new Node(v);
        if (root == null) { root = n; return; }
        Queue<Node> q = new LinkedList<>(); q.add(root);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (cur.left == null) { cur.left = n; return; }
            else q.add(cur.left);
            if (cur.right == null) { cur.right = n; return; }
            else q.add(cur.right);
        }
    }

    public void inorder() { inorderRec(root); System.out.println(); }
    private void inorderRec(Node node) { if (node==null) return; inorderRec(node.left); System.out.print(node.val + " "); inorderRec(node.right); }

    public void preorder() { preorderRec(root); System.out.println(); }
    private void preorderRec(Node node) { if (node==null) return; System.out.print(node.val + " "); preorderRec(node.left); preorderRec(node.right); }

    public void postorder() { postorderRec(root); System.out.println(); }
    private void postorderRec(Node node) { if (node==null) return; postorderRec(node.left); postorderRec(node.right); System.out.print(node.val + " "); }

    public void levelOrder() {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>(); q.add(root);
        while (!q.isEmpty()) {
            Node cur = q.poll(); System.out.print(cur.val + " ");
            if (cur.left != null) q.add(cur.left);
            if (cur.right != null) q.add(cur.right);
        }
        System.out.println();
    }
}
