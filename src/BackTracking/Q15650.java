package BackTracking;

import java.util.Scanner;

public class Q15650 {

  public static int[] arr;
  public static int N,M;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    M = sc.nextInt();

    arr = new int[M];

    dfs(1,0);

  }

  public static void dfs(int at, int depth){

    if(depth == M){
      for(int val : arr){
        System.out.println(val + " ");
      }
      System.out.println();
      return;
    }

    for(int i = at; i <= N; i++){

      arr[depth] = i;
      dfs(i + i, depth +1);

    }


  }


}
