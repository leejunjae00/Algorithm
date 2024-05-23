package DP;

import java.util.Scanner;

public class Q11058_boj {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    long[] dp = new long[n + 1];

    for (int i = 1; i <= n; i++) {
      dp[i] = i;
    }

    for (int i = 7; i <= n; i++) {
      for (int j = 3; j < i; j++) {
        dp[i] = Math.max(dp[i], dp[i - j] * (j - 1));
      }
    }
    System.out.println(dp[n]);
  }
}