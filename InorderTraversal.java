import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node {
  Node left;
  Node right;
  int data;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

public class InorderTraversal {
  public static void main(String[] args) {
    //Build a tree
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);

    n1.left = n2;
    n1.right = n3;
    n2.right = n4;
    n3.left = n5;
    n3.right = n6;

    Stack<Node> stack = new Stack<Node>();
    stack.push(n1);

    while(!stack.isEmpty()) {
      Node curr = stack.peek();
      if(curr.left != null) {
        stack.push(curr.left);
      }
      else {
        Node popped = stack.pop();
        if(!stack.isEmpty()){
          Node top = stack.peek();
          top.left = null;
        }
        System.out.println(popped.data);
        if(popped.right != null) {
          stack.push(popped.right);
        }
      }
    }
  }
}
