package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q1946_boj {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int tc=0; tc<T; tc++) {

      int N = sc.nextInt();

      int[][] arr = new int[N][2];

      int count = 1;			// 첫 번째 사람 자동 선발

      for(int i=0; i<N; i++) {

        arr[i][0] = sc.nextInt();
        arr[i][1] = sc.nextInt();
      }

      // 정렬 - Comparator
      Arrays.sort(arr, new Comparator<int[]>() {

        @Override
        public int compare(int[] arr1, int[] arr2) {	// 서류를 기준으로 오름차순 정렬
          return Integer.compare(arr1[0], arr2[0]);
        }
      });

      int score = arr[0][1];	// 기준 첫 번째 지원자의 면접 성적
      for(int i=1; i<N; i++) {
        if(arr[i][1] < score) {	// 면접 성적이 그 전 선발된 지원자 보다 뛰어나면 선발
          score = arr[i][1];	// 전에 선발된 지원자의 면접 성적
          count ++;
        }
      }
      System.out.println(count);
    }
  }
}