import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PowerOfThree {

  public static void main(String[] args) {
    int num = 27;
    boolean result = isPowerOfThree(num);
    System.out.println(result);
  }

  public static boolean isPowerOfThree(int num) {

    while(num % 3 == 0) {
      num = num / 3;
    }
    if(num == 1) {
      return true;
    } else {
      return false;
    }
  }

}
