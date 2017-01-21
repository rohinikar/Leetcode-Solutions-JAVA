import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PowerOfThreeI {

  public static void main(String[] args) {
    int num = 27;
    boolean result = isPowerOfThree(num);
    System.out.println(result);
  }

  public static boolean isPowerOfThree(int num) {
    if(num == 1) {
      return true;
    }
    if(num % 3 != 0) {
      return false;
    }
    return isPowerOfThree(num / 3);
  }

}
