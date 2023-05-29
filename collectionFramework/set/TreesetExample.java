package collectionFramework.set;

import java.util.*;

public class TreesetExample {

	public static void main(String[] args) {
		Set set = new TreeSet(new TestComp());
		
		
		
//		for(int i = 0; set.size() < 6; i++) {
//			int num = (int)(Math.random()*45)+1;
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
//		}
		//treeset는 정렬이 되어서 나온다. hashset과 차이점 (범위 검색과 정렬에 유리하다.)
		System.out.println(set);
		
		TreeSet set2 = new TreeSet();
		
		int[] arr = {85,90,50,35,45,65,20,10,100};
		
		for(int i = 0; i < arr.length; i++) {
			set2.add(arr[i]);
		}
		
		// TreeSet은 범위 검색에 유용하다.
		System.out.println("50보다 작은 값: "+set2.headSet(50)); // 50은 포함하지 않는다.
		System.out.println("50보다 큰 값: "+set2.tailSet(50)); // 50 포함
		System.out.println("40과 80 사이의 값: "+set2.subSet(40, 80));
	}

}

class Test{

	@Override
	public String toString() {
		return "Test";
	}
	
	
	
}

class TestComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return 1;//리턴값이 1이면 다음 비교값이 항상 더 크다
	}
	
	
	
}
