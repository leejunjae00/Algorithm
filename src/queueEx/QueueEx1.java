package queueEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
  public static void main (String[] args){
    Queue q = new LinkedList();

    q.offer("0");
    q.offer("1");
    q.offer("2");

    System.out.println("---Queue---");
    while(!q.isEmpty()){    // 큐가 비어있다면
      System.out.println(q.poll());
    }
  }

}
