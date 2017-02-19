import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoSum {
  public static void main(String[] args) {
    int[] arr = {2, 7, 11, 15};
    int target = 9;
    int[] indices = twoSum(arr, target);
    for(int i = 0; i < indices.length; i++) {
      System.out.print(indices[i]);
    }
  }

  private static int[] twoSum(int[] arr, int target) {
    int[] result = new int[2];
    result[0] = -1;
    result[1] = -1;
    if(arr == null || arr.length < 2) {
      return result;
    }

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int len = arr.length;
    for(int i = 0; i < len; i++) {
      int num = arr[i];
      int rem = target - num;
      if(!map.containsKey(rem)) {
        map.put(num, i);
      } else {
        result[0] = map.get(rem);
        result[1] = i;
        return result;
      }
    }

    return result;
  }
}
