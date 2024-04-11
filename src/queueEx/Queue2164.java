package queueEx;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue2164 {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    Queue<Integer> myQueue = new LinkedList<>(); // 정수형 큐 선언
    int N = sc.nextInt();
    for(int i = 1; i <= N; i++){
      myQueue.add(i);  // 큐에 카드 저장하기

    }
    while(myQueue.size()>1) {
      myQueue.poll(); // 맨 위의 카드를 버림
      int temp = myQueue.poll(); // 그 다음 맨위의 카드 버린 후
      myQueue.add(temp);  // 맨 밑으로 삽입
    }
    System.out.println(myQueue.poll());
  }
}
