package collectionFramework.set;

import java.util.*;

public class HashsetExample {

	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		//set에는 중복이 안된다. 주의* 순서도 없음
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		System.out.println(set);
		
		Iterator it = set.iterator(); //iterator를 사용해 호출하기
		
		while(it.hasNext()) {
			System.out.print(it.next()+",");
		}
		System.out.println();
		
		
		Set set2 = new HashSet();
		
		for(int i = 0; set2.size() < 6; i++) {
			int num = (int)(Math.random()*100)+1;
			set2.add(new Integer(num));
		}
		
		System.out.println(set2); 
		// set은 sort가 안되기때문에 
		List list = new LinkedList(set2); // set을 list에 저장
		Collections.sort(list); // list를 collections 메서드 sort를 이용해서 정렬
		
		System.out.println(list);//list를 출력
		
		
		
		
		
	}

}
