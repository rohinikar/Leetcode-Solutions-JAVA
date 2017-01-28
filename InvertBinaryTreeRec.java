import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

public class InvertBinaryTreeRec {
  public static void main(String[] args) {

    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);
    Node n7 = new Node(7);

    n1.left = n2;
    n1.right = n3;
    n2.right = n4;
    n3.left = n5;
    n3.right = n6;
    n4.left = n7;

    invertBinaryTree(n1);
    printTree(n1);
  }

  private static void invertBinaryTree(Node n) {
    if(n == null || (n.left == null && n.right == null)) {
      return;
    }

    Node temp = n.left;
    n.left = n.right;
    n.right = temp;

    invertBinaryTree(n.left);
    invertBinaryTree(n.right);

  }

  private static void printTree(Node root) {
    if(root == null) {
      return;
    }
    System.out.print(root.data + " ");
    printTree(root.left);
    printTree(root.right);
  }

}