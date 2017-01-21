import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FractionToDecimal {

  public static void main(String[] args) {
    int num = 1;
    int den = 2;
    String decimal = fracToDec(num, den);
    System.out.println(decimal);
  }

  public static String fracToDec(int num, int den) {
    String result = "";
    if(den == 0) {
      return "Invalid operation";
    }
    if(num < 0) {
      if(den > 0) {
        result += "-";
      }
    } else {
      if(den < 0) {
        result += "-";
      }
    }

    long quotient = (long)(num / den);
    result += quotient;

    long rem = (long)(num % den);
    if(rem == 0) {
      return result;
    }
    result += ".";
    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    while(true) {
      map.put(rem, result.length());
      while(rem < den) {
        rem = rem * 10;
      }
      quotient = rem / den;
      result += quotient;
      rem = rem % den;
      if(rem == 0) {
        return result;
      } else {
        if(map.containsKey(rem)) {
          int index = map.get(rem);
          String pre = result.substring(0, index);
          String post = result.substring(index, result.length());
          return pre + "(" + post + ")";
        }
      }
    }
  }
}
