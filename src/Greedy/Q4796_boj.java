package Greedy;

import java.util.Scanner;

public class Q4796_boj{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int cnt = 1;

    while(true){
      int l = sc.nextInt();
      int p = sc.nextInt();
      int v = sc.nextInt();
      if(l == 0 && p == 0 && v == 0) break; // 0 일때 종료

      int result = l * (v/p) + Math.min(l, v%p);  // Math.min 함수 : 둘 중에 작은 값 반환
      sb.append("Case "+ cnt +" : "+ result + "\n");

      cnt++;
    }

    System.out.print(sb);
  }
}