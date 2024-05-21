package DP;

import java.util.Scanner;

public class Q2775_boj {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] APT = new int[15][15];

    for (int i = 0; i < 15; i++) {
      APT[i][1] = 1;  // i층 1호
      APT[0][i] = i;  // 0층 i호
    }

    // 나머지 층의 각 호수 별로 사람 수
    for (int i = 1; i < 15; i++) {
      for (int j = 2; j < 15; j++) {
        APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
      }
    }

    int T = sc.nextInt(); // 테스트 케이스

    for (int i = 0; i < T; i++) {
      int k = sc.nextInt(); // 층수
      int n = sc.nextInt(); // 호수

      System.out.println(APT[k][n]);
    }
  }
}
