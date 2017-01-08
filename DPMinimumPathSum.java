import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DPMinimumPathSum {
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
    dp[0][0] = grid[0][0];

    for(int i = 1; i < cols; i++) {
      dp[0][i] = dp[0][i - 1] + grid[0][i];
    }
    for(int i = 1; i < rows; i++) {
      dp[i][0] = dp[i - 1][0] + grid[i][0];
    }

    for(int i = 1; i < rows; i++) {
      for(int j = 1; j < cols; j++) {
        dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
      }
    }

    System.out.println(dp[rows - 1][cols - 1]);
  }
}
