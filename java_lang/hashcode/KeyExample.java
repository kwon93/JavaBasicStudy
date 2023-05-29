package java_lang.hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "value1");
		hashMap.put(new Key(2), "value2");
		hashMap.put(new Key(1), "value3");
		
		System.out.println(hashMap.size()); //해쉬맵에 키와값의 쌍이 총 몇개 저장되있는지 출력함.
		

		
		
		
	}

}
