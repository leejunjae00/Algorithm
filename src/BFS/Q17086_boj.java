package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17086_boj {

  static int N, M; // 격자의 크기
  static int[] dx = {-1,-1,0,1,1,1,0,-1}; // x축의 변화량
  static int[] dy = {0,1,1,1,0,-1,-1,-1}; // y축의 변화량


  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    int[][] map = new int[N][M]; // 격자의 상태를 저장함
    int[][] cnts = new int[N][M]; // 각 지점까지 안전거리 배열

    Queue<Pair> q = new LinkedList<>(); // 상어의 위치를 저장하기 위한 큐 선언

    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j=0; j<M; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
        if(map[i][j] == 1) {
          q.offer(new Pair(i,j)); // 상어의 위치를 넣어줌 //
        }
      }
    }

    int cnt = Integer.MIN_VALUE; // 초기값 갱신

    while(!q.isEmpty()){ // 각 지점까지 최단 거리 구함 q 비어 있는 상태일때 까지 반복
      Pair pair = q.poll();
      int x = pair.x;
      int y = pair.y;

      for(int i=0; i<8; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if(valid(nx, ny)) {
          if(cnts[nx][ny] == 0 && map[nx][ny] != 1) {	//안전거리가 저장안되어있거나, 상어의 위치가 아니면
            cnts[nx][ny] = cnts[x][y]+1; //안전거리 1증가
            cnt = Math.max(cnts[nx][ny], cnt);
            q.add(new Pair(nx, ny));
          }
        }
      }
    }

    System.out.println(cnt);

  }

  public static boolean valid(int x, int y) { // 유효 범위 내에 있는지 확인
    if(x < 0 || x >= N || y < 0 || y >= M) {
      return false;
    }
    return true;
  }

  static class Pair{
    int x;
    int y;

    public Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}