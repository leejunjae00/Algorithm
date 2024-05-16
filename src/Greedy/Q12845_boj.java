package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q12845_boj {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    Integer[] arr = new Integer[n];

    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    Arrays.sort(arr,Comparator.reverseOrder());

    int sum = 0;
    int result = arr[0]; // 배열의 가장 큰 값 저장
    for(int j = 1; j < n; j++){
      sum += result + arr[j];

    }
    System.out.println(sum);

    }
  }