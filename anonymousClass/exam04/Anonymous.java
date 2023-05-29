package anonymousClass.exam04;

public class Anonymous {
	private int field;
	
	public void method1(int arg1, int arg2) { // final키워드는 생략되어있음.
		int var1 = 0;
		int var2  =0;
		
		field = 10; //단 필드값은 변경이 가능하다 final성격 X
		
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				// 익명 객체 내부에서 변수들은 final 성격을 가진다.
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
