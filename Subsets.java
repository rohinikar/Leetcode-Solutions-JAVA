import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Subsets {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    ArrayList<ArrayList<Integer>> result = getSubsets(arr);
    for(ArrayList<Integer> list : result) {
      for(Integer i : list) {
        System.out.print(i + " ");
      }
      System.out.println("");
    }
  }

  public static ArrayList<ArrayList<Integer>> getSubsets(int[] arr) {
    Arrays.sort(arr);
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    for(int i = 0; i < arr.length; i++) {
      int curr = arr[i];
      if(result.size() >= 1) {
        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
        for(ArrayList<Integer> list : result) {
          temp.add(new ArrayList<Integer>(list));
        }
        for(ArrayList<Integer> list : temp) {
          list.add(curr);
          result.add(new ArrayList<Integer>(list));
        }
      }
      ArrayList<Integer> singleElem = new ArrayList<Integer>();
      singleElem.add(curr);
      result.add(singleElem);

    }
    result.add(new ArrayList<Integer>());
    return result;
  }
}
