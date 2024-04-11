package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q11724_boj {
  static  boolean visited[];
  static ArrayList<Integer>[] A;
  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    visited = new boolean[n+1];
    A = new ArrayList[n+1];
    for(int i = 1; i < n+1; i++){
      A[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i<m; i++){
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      A[s].add(e);
      A[e].add(s);
    }
    int count = 0;
    for(int i = 1; i<n+1; i++){
        if(!visited[i]){  // 방문하지 않은 노드
          count++;
          DFS(i);
        }
    }
    System.out.println(count);
  }

  private static void DFS(int v) {    // 재귀함수
    if(visited[v]){  // 방문노드이면
      return;     // 더 이상 탐색하지 않음
    }
    visited[v] = true; // 방문 노드가 아님, 방문할 노드
    for(int i : A[v]){  // 현재 노드에서 연결되어 있는 노드들을 모두 탐색
      if(!visited[i]){  // 탐색하지 않은 노드가 있다면
          DFS(i);  // DFS 실행
      }
    }
  }
}
