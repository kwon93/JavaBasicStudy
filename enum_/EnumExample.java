package enum_;
//  			 0   	1	  2		3
enum Direction{ EAST, SOUTH, WEST, NORTH}
			// 열거형 상수들은 하나하나가 다 객체다.
public class EnumExample {

	public static void main(String[] args) {
		//열거형 호출하는 방법
		Direction d1 = Direction.EAST; //열거형타입.상수이름
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3); 
		
		System.out.println(d1 == d2); //false
		System.out.println(d1 == d3); // true
		System.out.println(d1.equals(d3)); // true 객체기에 equals()메서드 사용 가능
		System.out.println(d1.compareTo(d3));
		System.out.println(d1.compareTo(d2)); // 2인 WEST가 더 크기에 -2출력
		
		switch(d2) {
		case EAST:
			System.out.println("The direction is EAST."); break;
		case SOUTH:
			System.out.println("The direction is SOUTH."); break;
		case WEST:
			System.out.println("The direction is WEST."); break;
		case NORTH:
			System.out.println("The direction is NORTH."); break;
		default : 
				System.out.println("Invalid direction"); break;
		}
		
		Direction[] dArr = Direction.values();
		for (Direction direction : dArr) {
		
			System.out.print(direction.ordinal()+",");//ordinal: 열거형 상수 순서 값을 나타냄.
			System.out.print(direction+","); //ordinal: 열거형 상수 순서 값을 나타냄.
		}
		System.out.println();
		
	}

}
