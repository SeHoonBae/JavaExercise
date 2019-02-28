package com.test.example.collection;

public class Ex76_Collection {

	public static void main(String[] args) {
		
		
		//Queue
		//배열 생성
		MyQueue queue = new MyQueue();

		//추가
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");

		//읽기
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		//개수
		System.out.println(queue.size());

		//확인
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.size());

		//크기 조절
		queue.trimToSize();

		//초기화
		queue.clear();
		System.out.println(queue.size());
		
		
		//Stack
		//배열 생성
		MyStack stack = new MyStack();

		//추가
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");

		//읽기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		//개수
		System.out.println(stack.size());

		//확인
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());

		//크기 조절
		stack.trimToSize();

		//초기화
		stack.clear();
		System.out.println(stack.size());
		
		
		
	}
}
