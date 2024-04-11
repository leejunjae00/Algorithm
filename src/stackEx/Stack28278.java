package stackEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack28278 {
  static BufferedReader br; // 입력 읽기 위한 객체
  static StringBuilder sb; // 출력을 하기 위한 객체
  static int[] stack = new int[1000000]; // 스택을 나타내기 위해 정수 배열 선언
  static int top = 0; // 스택의 맨위의 인덱스

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));  // 입력을 읽기 위해 선언
    sb = new StringBuilder();  // 문자열 추가, 변경하기 위한 클래스
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());  // 스택의 총 작업 횟수

    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine()); // 한 줄씩 읽어서 할당
      switch(st.nextToken()) {
        case "1" : push(Integer.parseInt(st.nextToken())); break;
        case "2" : pop(); break;
        case "3" : size(); break;
        case "4" : empty(); break;
        case "5" : peek(); break;
      }
    }
    System.out.print(sb.toString());
  }

  static void push(int n) {  // 스택의 맨위에 'n' 추가
    stack[top++] = n;
  }
  static void pop() {  // 스택의 맨 위에 있는 요소 제거
    if(top > 0) sb.append(stack[--top]).append("\n");
    else sb.append(-1).append("\n");
  }
  static void size() {  // 스택의 현재 크기 추가
    sb.append(top).append("\n");
  }
  static void empty(){  // 스택이 비어있는지 확인, 비어있으면 1, 아니면 0
    if(top == 0) sb.append(1).append("\n");
    else sb.append(0).append("\n");
  }
  static void peek() {  // 맨 위에 있는 요소 확인, 값을 추가 비어있다면 '-1' 추가
    if (top == 0) sb.append(-1).append("\n");
    else sb.append(stack[top - 1]).append("\n");
  }

}