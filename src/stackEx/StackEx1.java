package stackEx;

import java.util.Stack;

public class StackEx1 {
  public static void main(String[] args) {
    Stack st = new Stack();
    st.push("0");
    st.push("1");
    st.push("3");

    System.out.println("---Stack---");
    while(!st.empty()){   // 스택이 비어있다면
      System.out.println(st.pop());
    }

  }
}
