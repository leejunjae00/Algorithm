package BackTracking;

import java.util.Scanner;

public class Q15649 {

  public static int[] arr;
  public static boolean[] visit;

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int N = in.nextInt(); // N까지의 수
    int M = in.nextInt(); // M은 수열의 길이

    arr = new int[M]; // 탐색 과정에서 값을 담을 배열
    visit = new boolean[N]; //방문한 노드인지 확인하기 위해 생성
    dfs(N, M, 0);

  }

  public static void dfs(int N, int M, int depth) {
    if (depth == M) {   // 재귀가 깊어 질때 마다 1씩 증가하고 M과 같아지면 arr 배열을 출력
      for (int val : arr) {
        System.out.print(val + " ");
      }
      System.out.println();
      return;
    }

    for (int i = 0; i < N; i++) {
      if (!visit[i]) {
        visit[i] = true;  // 해당 노드를 방문 상태로 변경
        arr[depth] = i + 1;   // 해당 깊이를 index로 하여 i + 1 값을 저장
        dfs(N, M, depth + 1);   // 다음 자식 노드를 방문하기 위해 depth을 1 증가시키면서 재귀 호출
        // 자식노드 방문이 끝나고 돌아오면 방문 노드를 방문하지 않은 상태로 변경
        visit[i] = false;
      }
    }
  }

}