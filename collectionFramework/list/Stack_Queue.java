package collectionFramework.list;

import java.util.*;

public class Stack_Queue {
	/*
	 * stack : 수식계산, 수식괄호검사, 문서의 뒤로가기 앞으로가기에 ex)ctrl+z 활용.
	 * Queue : 최근사용문서, 인쇄 작업 대기목록, Buffer 
	 * */

	public static void main(String[] args) {
		Stack s = new Stack();
		Queue q = new LinkedList(); //queue의 인터페이스 구현체인 linkedList사용
		
		s.push(0);
		s.push(1);
		s.push(2);
		System.out.println(s.toString());
		
		while(!s.isEmpty()) { // 비어있지않다면 계속 출력 
			System.out.println(s.pop());
		}
		
		System.out.println(s.toString());
		
		
		
		q.offer(0);
		q.offer(1);
		q.offer(2);
		
		while(!q.isEmpty()) { // 비어있을때까지 추출
			System.out.println(q.poll());
		}
		
		System.out.println(q.toString());
		
		
		
	}

}
