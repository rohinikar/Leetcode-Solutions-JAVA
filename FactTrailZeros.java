import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FactTrailZeros {

  public static void main(String[] args) {
    int num = 5;
    int result = countFactTrailZeros(num);
    System.out.println(result);
  }

  public static int countFactTrailZeros(int num) {
    int count = 0;
    for(int i = 5; (num / i) >= 1; i = i * 5) {
      count += num / i;
    }
    return count;
  }

}
