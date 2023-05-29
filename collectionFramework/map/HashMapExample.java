package collectionFramework.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111"); // 1111의 중복은 
		map.put("asdf", "1234"); // 1234로 바뀐다
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디를 입력해주세요.");
			System.out.println("ID: ");
			String iD = sc.nextLine().trim();
			
			System.out.println("Password: ");
			String pW = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(iD)) {
				System.out.println("입력된 ID는 등록되지않은 ID입니다.");
				continue;
			}
			
			if(!(map.get(iD).equals(pW))) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}else {
				System.out.println("ID와 비밀번호가 일치합니다.");
				break;
			}
					
			
		}
	}

}
