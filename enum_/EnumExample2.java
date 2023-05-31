package enum_;

enum Direction2{
	EAST(1,">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	
	private static final Direction2[] DIR_ARR = Direction2.values();
	private final int value;
	private final String symbol;
	
	Direction2(int value, String symbol){ // 열거형 상수는 접근제어자 private이 생략되어있음.
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() {return value;}
	public String getSymbol() {return symbol;}
	
	public static  Direction2 of(int dir) throws IllegalAccessException {
		if(dir < 1 || dir > 4) { // 0~3 범위를 벗어나면 예외가 발생하게 만듬
			throw new IllegalAccessException("Invalid value: "+dir);
		}
		
		return DIR_ARR[dir - 1];
	}
	
	public Direction2 rotate(int num) {
		num %= 4;
		
		if(num < 0) num += 4;
		
		return DIR_ARR[(value-1+num) % 4];
	}
	
	public String toString() {
		return name()+getSymbol();
	}
	
	
}

public class EnumExample2 {

	public static void main(String[] args) {
		
		for (Direction2 d : Direction2.values()) {
			System.out.println(d.name()+" = "+d.getValue());
		}
	}

}
