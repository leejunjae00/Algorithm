package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Q2217_boj {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] ropes = new int[N + 1];

    for (int i = 1; i <= N; i++) {
      ropes[i] = scanner.nextInt();
    }

    Arrays.sort(ropes); // 로프를 오름차순으로 정렬

    int max = ropes[N]; // 최대 중량을 저장

    // 각 로프의 중량과 사용할 수 있는 남은 로프의 개수를 곱한 값을 최대 중량과 비교
    // 더 큰 값을 저장
    for (int i = 1; i < N; i++) {
      max = Math.max(max, ropes[i] * (N - (i - 1)));
    }
    System.out.println(max);
  }
}