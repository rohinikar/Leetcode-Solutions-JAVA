import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MovingAvgDataStream {

  LinkedList<Integer> queue;
  int size;
  double avg;

  public MovingAvgDataStream(LinkedList<Integer> queue, int size) {
    this.queue = queue;
    this.size = size;
  }

  public static void main(String[] args) {
    System.out.println("Hello World");
    LinkedList<Integer> list = new LinkedList<Integer>();
    MovingAvgDataStream mads = new MovingAvgDataStream(list, 3);
    mads.getAverage(5);
    mads.getAverage(5);
    mads.getAverage(5);
    mads.getAverage(5);
    mads.getAverage(5);
  }

  public double getAverage(int next) {
    if(queue.size() < this.size) {
      int sum = 0;
      queue.offer(next);
      for(int i : queue) {
        sum += i;
      }
      avg = (double)sum / queue.size();
      return avg;
    } else {
      int num1 = queue.poll();
      queue.offer(next);
      avg = avg - ((double)num1 / this.size) + ((double)next / this.size);
      return avg;
    }
  }
}
