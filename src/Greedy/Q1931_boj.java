package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q1931_boj {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[][] time = new int[N][2];

    for(int i = 0; i < N; i++) {
      time[i][0] = sc.nextInt();	// 시작시간
      time[i][1] = sc.nextInt();	// 종료시간
    }


    Arrays.sort(time, new Comparator<int[]>() {  // 끝나는 시간을 기준으로 정렬

      @Override
      public int compare(int[] c1, int[] c2) {

        // 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.
        if(c1[1] == c2[1]) {
          return c1[0] - c2[0];
        }

        return c1[1] - c2[1];
      }

    });

    int count = 0;
    int preend = 0;

    for(int i = 0; i < N; i++) {

      // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
      if(preend <= time[i][0]) {  // 바로 직전 종룔시간이 다음 시작 시간보다 작거나 같으면 갱신해준다.
       preend = time[i][1];
        count++;
      }
    }

    System.out.println(count);
  }

}
