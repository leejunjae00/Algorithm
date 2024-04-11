package queueEx;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue1021 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Queue<Integer> Que = new LinkedList<>();    // N개 원소를 담은 큐
    Queue<Integer> Fq = new LinkedList<>();     // 찾아야 하는 수를 담은 큐

    int N = sc.nextInt();   // 큐의 크기
    int M = sc.nextInt();   // 연산의 수
    int total = 0;

    for (int i = 1; i <= N; i++) {  // 1부터 N 까지 순서대로 큐에 추가
      Que.add(i);
    }

    for (int i = 0; i < M; i++) {   // M 번의 연산을 수행, 필요한 숫자 Fq에 추가
      int x = sc.nextInt();
      Fq.add(x);
    }

    while (!Fq.isEmpty()) { // 찾아내야 하는 수 poll, x로 저장
      int x = Fq.poll();
      int cnt = 0;
      while (x != Que.peek()) {   // 큐 맨앞 원소를 꺼내고, Qf에 저장, 다시 추가해 회전 시킴
        int Qfront = Que.poll();
        Que.add(Qfront);
        cnt++;
      }
      total += Math.min(cnt, Que.size() - cnt);   // 주어진 두 값중에서 더 작은 값을 반환 하는 함수
      Que.poll();
    }
    System.out.println(total);
  }
}