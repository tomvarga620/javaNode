package sk.itsovy.projectBinary;

public class Main {

    public static void main(String[] args) {

        Node root = new Node(72);
        Tree tree = new Tree(root);
        Node node1 = new Node(14);
        tree.addNode(node1);
        Node node2 = new Node(85);
        tree.addNode(node2);
        Node node3 = new Node(20);
        tree.addNode(node3);

        //skrateny zapis
        tree.addNode(new Node(3));
        tree.addNode(new Node(2));
        tree.addNode(new Node(6));

    }
}
