import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WordLadder {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();
    set.add("hot");
    set.add("dot");
    set.add("dog");
    set.add("lot");
    set.add("log");
    String start = "hit";
    String end = "cog";
    int result = wordLadder(set, start, end);
    System.out.println(result);
  }

  private static int wordLadder(Set<String> dict, String start, String end) {
    if(dict == null || dict.size() == 0 || start == null || end == null) {
      return -1;
    }

    LinkedList<String> words = new LinkedList<String>();
    LinkedList<Integer> steps = new LinkedList<Integer>();
    if(start.length() != end.length()) {
      return -1;
    }
    if(dict.contains(start)) {
      dict.remove(start);
    }
    dict.add(end);
    words.add(start);
    steps.add(1);

    while(!words.isEmpty()) {
      String curr = words.remove();
      int step = steps.remove();
      if(curr.equals(end)) {
        return step;
      }

      for(int i = 0; i < curr.length(); i++) {
        char c = curr.charAt(i);
        for(char ch = 'a'; ch <= 'z'; ch++) {
          if(c != ch) {
            char[] arr = curr.toCharArray();
            arr[i] = ch;
            String temp = new String(arr);
            if(dict.contains(temp)) {
              dict.remove(temp);
              words.add(temp);
              steps.add(step + 1);
            }
            arr[i] = c;
          }
        }
      }
    }
    return -1;
  }
}
