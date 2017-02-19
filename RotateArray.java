import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RotateArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;
    rotateArray(arr, k);
  }

  private static void rotateArray(int[] arr, int k) {
    if(arr == null || arr.length == 0) {
      System.out.println("Bad arguments");
      return;
    }

    int n = arr.length;
    if(k == n) {
      System.out.println("Already rotated");
      return;
    }
    if(k > n) {
      k = k % n;
    }
    reverse(arr, 0, n - k - 1);
    reverse(arr, n - k, n - 1);
    reverse(arr, 0, n - 1);

    for(int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  private static void reverse(int[] arr, int begin, int end) {
    if(begin >= end) {
      return;
    }

    while(begin < end) {
      int temp = arr[begin];
      arr[begin] = arr[end];
      arr[end] = temp;
      begin++;
      end--;
    }
  }


}
