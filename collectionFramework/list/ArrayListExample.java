package collectionFramework.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		//기본 용량이 10인 어레이 리스트 생성
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(8));
		list1.add(new Integer(9));
		list1.add(new Integer(4));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		list1.add(new Integer(10));
		list1.add(new Integer(1));
		list1.add(7); // autoboxing 으로 기본형에서 참조형(Integer)으로 변환됨.
		
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 1index이상 4index 미만
		
		System.out.println(list2);
		
		Collections.sort(list1); // 오름차순으로 정렬
		Collections.sort(list2);
		System.out.println("sort: "+list1);
		System.out.println("sort: "+list2);
		
		System.out.println(list1.containsAll(list2)); // list1의 요소가 list2의 요소를 포함하느냐
		
		System.out.println(list1.indexOf(11)); // 요소 검색 있다면 인덱스번호 return, 없다면 -1
//		list1.remove(1); index가 1인 개체 삭제
//		list1.remove(new Integer(1)); 요소가 1인 개체 삭제
		
	}

}
