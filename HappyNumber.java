import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HappyNumber {

  public static void main(String[] args) {
    int num = 19;
    boolean result = isHappyNumber(num);
    System.out.println(result);
  }

  public static boolean isHappyNumber(int num) {
    int sum = 0;
    int curr = num;

    while(sum != num) {
      sum = 0;
      while(curr != 0) {
        int rem = curr % 10;
        curr = curr / 10;
        sum += rem * rem;
      }
      if(sum == 1) {
        return true;
      } else {
        if(sum == num) {
          return false;
        }
      }
      curr = sum;
      System.out.println("Sum = " +sum);
    }

    return false;

  }

}
