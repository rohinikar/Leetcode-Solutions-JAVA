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

public class ValidBinSrchTree {
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

    Boolean result = validate(n1);
    System.out.println(result);
  }

  private static Boolean validate(Node n) {
    if(n == null) {
      return true;
    }

    LinkedList<Node> list = new LinkedList<Node>();
    list.add(n);

    while(!list.isEmpty()) {
      Node curr = list.remove();
      if(curr.left != null) {
        if(curr.left.data > curr.data) {
          return false;
        } else {
          list.add(curr.left);
        }
      }
      if(curr.right != null) {
        if(curr.right.data <= curr.data) {
          return false;
        } else {
          list.add(curr.right);
        }
      }
    }
    return true;
  }
}
