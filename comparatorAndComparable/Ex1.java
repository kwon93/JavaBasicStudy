package comparatorAndComparable;

import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		if (a < b){
			System.out.println("a 는 b보다 작다");
		}

		String[] animals = {"Tiger","bird","Cat","Lion","dog"};

		Arrays.sort(animals); // 기본 정렬 알파벳순서, 대문자 먼저
		System.out.println(Arrays.toString(animals));

		Arrays.sort(animals, String.CASE_INSENSITIVE_ORDER);
		// 대소문자 상관없이 알파벳순으로 정렬.
		System.out.println(Arrays.toString(animals));

		Arrays.sort(animals, new Descending());
		System.out.println(Arrays.toString(animals));

		int[] arr = {5,7,3,9,1};

		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i);
		}
	}

}

class Descending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1;
			//원래 compare()는 같으면 0 왼쪽이 크면 양수, 오른쪽이 크면 음수를 리턴하는데
			//-1을 곱해줌으로서 왼쪽이 크면 음수를, 오른쪽이 크면 양수를 리턴해주면서
			//순서를 역으로 정렬하게된다.
		}
		return -1;
	}

}
