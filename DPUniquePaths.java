import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DPUniquePaths {
  public static void main(String[] args) {
    int[][] grid = new int[][]{
      {1, 2, 3, 4, 5, 6},
      {1, 2, 3, 4, 5, 6},
      {1, 2, 3, 4, 5, 6},
      {1, 1, 1, 1, 1, 6},
    };

    int rows = grid.length;
    int cols = grid[0].length;

    int[][] dp = new int[rows][cols];
    for(int i = 0; i < rows; i++) {
      dp[i][0] = 1;
    }
    for(int i = 0; i < cols; i++) {
      dp[0][i] = 1;
    }

    for(int i = 1; i < rows; i++) {
      for(int j = 1; j < cols; j++) {
        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
      }
    }

    for(int i = 0; i < rows; i++) {
      System.out.println("");
      for(int j = 0; j < cols; j++) {
        System.out.print(dp[i][j] + " ");
      }
    }

    System.out.println(dp[rows - 1][cols - 1]);

  }
}
