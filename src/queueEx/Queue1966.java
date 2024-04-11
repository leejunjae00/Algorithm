package queueEx;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue1966 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(); // StringBuilder로 출력을 저장

    int T = in.nextInt();	// 테스트 케이스

    while (T --> 0) {

      int N = in.nextInt(); // 문서의 수
      int M = in.nextInt(); // 찾을려는 문서의 위치

      LinkedList<int[]> q = new LinkedList<>();	// 연결리스트 초기화

      for (int i = 0; i < N; i++) {  // 초기 위치와 중요도
        q.offer(new int[] { i, in.nextInt() });
      }

      int count = 0;

      while (!q.isEmpty()) {	// 한 케이스에 대한 반복문

        int[] front = q.poll();	// 가장 첫 원소를 꺼냄
        boolean isMax = true;	// front 원소가 가장 큰 원소인지를 판단하는 변수

        // 큐에 남아있는 원소들과 중요도를 비교
        for(int i = 0; i < q.size(); i++) {
          // 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우
          if(front[1] < q.get(i)[1]) {
            // 뽑은 원소 및 i 이전의 원소들을 뒤로 보내버린다
            q.add(front);
            for(int j = 0; j < i; j++) {
              q.add(q.poll());
            }
            // front원소가 가장 큰 원소가 아니였으므로 false를 하고 탐색을 마침
            isMax = false;
            break;
          }
        }
        // front 원소가 가장 큰 원소가 아니면 다음 반복문으로
        if(isMax == false) {
          continue;
        }
        // front 원소가 가장 큰 원소였으므로 해당 원소를 출력해야함
        count++;
        if(front[0] == M) {	// 찾고자 하는 문서라면 종료
          break;
        }

      }
      sb.append(count).append('\n');
    }
    System.out.println(sb);
  }
}