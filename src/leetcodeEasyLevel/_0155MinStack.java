package leetcodeEasyLevel;

import java.util.Stack;

public class _0155MinStack {
  // Runtime 5 ms Memory 40.6 MB
  //스택을 두 개 생성하고 한 스택에는 min_val만 담는다.
    Stack<Integer> s = new Stack();
    Stack<Integer> min = new Stack();

  public void push(int x) {
    if(min.isEmpty() || x <= min.peek()){
      min.push(x);
    }
    s.push(x);
  }

  public void pop() {
    if(s.peek().equals(min.peek())){
      min.pop();
    }
      s.pop();
  }

  public int top() {
      return s.peek();
  }

  public int getMin() {
    return min.peek();
  }
}
