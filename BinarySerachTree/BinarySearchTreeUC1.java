package BinarySerachTree;

public class BinarySearchTreeUC1 {
    public static Node insert(Node node, int value) {
        if (node == null) {
            return createNewNode(value);
        }
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public static Node createNewNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTreeUC1 binarySearchTree = new BinarySearchTreeUC1();
        Node root = null;
        root = binarySearchTree.insert(root, 56);
        root = binarySearchTree.insert(root, 30);
        root = binarySearchTree.insert(root, 70);
        binarySearchTree.display(root);
    }
}

