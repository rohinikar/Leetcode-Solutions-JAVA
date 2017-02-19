import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReversePolish {
  public static void main(String[] args) {
    String[] arr = {"2", "1", "+", "3", "*"};
    int result = reversePolish(arr);
    System.out.println(result);
  }

  private static int reversePolish(String[] arr) {
    if(arr == null || arr.length == 0) {
      return -1;
    }
    int len = arr.length;
    String operators = "+-*/";
    Stack<Integer> stack = new Stack<Integer>();
    for(int i = 0; i < len; i++) {
      String curr = arr[i];
      int index = operators.indexOf(curr);
      if(index < 0) {
        int num = Integer.valueOf(curr);
        stack.push(num);
      } else {
        if(stack.size() < 2) {
          return -1;
        }
        int num1 = stack.pop();
        int num2 = stack.pop();
        switch(index) {
          case 0:
           stack.push(num1 + num2);
           break;
          case 1:
           stack.push(num2 - num1);
           break;
          case 2:
           stack.push(num1 * num2);
           break;
          case 3:
           stack.push(num2 / num1);
           break;
        }
      }
    }
    if(stack.size() != 1) {
      return -1;
    }
    return stack.pop();
  }
}
