/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author lyuat
 */
public class BinarySearchTree {

    public Node root;

    public BinarySearchTree() {
        this.root = new Node(10);
    }

    public class Node {

        Node lNode;
        Node rNode;
        int data;

        public Node(int data) {
            this.data = data;
            lNode = null;
            rNode = null;
        }
    }

    public Node addNode(Node root, int data) {

        if (root == null) {
         root = new Node(data);
         return root;
        }
        if (data > root.data) {
            root.rNode=addNode(root.rNode, data);

        } else {

            root.lNode=addNode(root.lNode, data);

        }
                return root;

    }

    public void deleteNode(int data) {

    }

    public void findNode(int data) {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      BinarySearchTree tree = new BinarySearchTree();
       Node n1= tree.addNode(tree.root, 10);
       
       n1= tree.addNode(n1, 50);
          n1= tree.addNode(n1, 9);

               n1= tree.addNode(n1, 11);



    }

}
