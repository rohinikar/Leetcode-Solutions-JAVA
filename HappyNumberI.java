import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HappyNumberI {

  public static void main(String[] args) {
    int num = 19;
    boolean result = isHappyNumber(num);
    System.out.println(result);
  }

  public static boolean isHappyNumber(int num) {
    HashSet<Integer> set = new HashSet<Integer>();

    while(!set.contains(num)) {
      set.add(num);
      int sum = getSum(num);
      if(sum == 1) {
        return true;
      }
      num = sum;
    }
    return false;
  }

  public static int getSum(int num) {
    int sum = 0;

    while(num != 0) {
      int rem = num % 10;
      num = num / 10;
      sum += rem * rem;
    }

    return sum;
  }

}
