package java_lang.equals;
//이퀄스 메소드 재정의를 통해 아이 필드값이 같다면 트루값을 리턴하도록 만듬.
public class MemberExample {

	public static void main(String[] args) {
		
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");
		
		if(m1.equals(m2)) {
			System.out.println("m1과 m2는 동등합니다.");
		}else {
			System.out.println("동등하지 않습니다.");
		}
		System.out.println(m1.hashCode());
		
		if(m1.equals(m3)) {
			System.out.println("m1과 m2는 동등합니다.");
		}else {
			System.out.println("동등하지 않습니다.");
		}
		
	
		
	}

}
