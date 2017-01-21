import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExcelColumnNum {

  public static void main(String[] args) {
    String colName = "AA";
    int result = getColNumber(colName);
    System.out.println(result);
  }

  public static int getColNumber(String colName) {
    int sum = 0;
    for(int i = 0; i < colName.length(); i++) {
      char curr = colName.charAt(i);
      int pos = curr - 'A';
      sum += Math.pow(26, i) + pos;
    }
    return sum;
  }

}
