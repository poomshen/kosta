import java.util.Stack;

import kr.or.kosta.MyStack;

//Java API
public class Ex07_Stack {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.Push(100);
		stack.Push(200);
		stack.Push(300);
		
		System.out.println(stack.Pop());
		System.out.println(stack.Pop());
		System.out.println(stack.Pop());
//		System.out.println(stack.pop());

	}

}

