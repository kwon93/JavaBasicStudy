package java_lang.hashcode;
//모든 클래스는 object 클래스를 상속한다.
public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override //equals메소드의 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		
		return id.hashCode();
	}
}
