package String.exam02;

public class SubstringExample {

	public static void main(String[] args) {
		String ssn = "931228-1234567";
		String firstSsn = ssn.substring(0,6); //시작 인덱스, 자르는 기준의 인덱스 
		System.out.println(firstSsn);
		String secondSsn = ssn.substring(7);
		System.out.println(secondSsn);
		
		String cutSsn = ssn.substring(8);
		String a = ssn.replace(cutSsn,"******");
		System.out.println(a);
			
			
			
			
		
		
		
	}

}
