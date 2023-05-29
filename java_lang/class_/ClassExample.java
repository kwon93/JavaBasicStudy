package java_lang.class_;
//3가지 방법의 클래스 객체 얻기 (리플렉션)
public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class clazz = Car.class; // 클래스 이름으로 클래스 객체를 얻음.
		Class clazz2 = Class.forName("java_lang.class_.Car"); //예외처리 해야함.
		
		Car c = new Car();
		
		Class clazz3 = c.getClass();
		
		//위 세가지 객체가 참조하는 메모리 번지는 다 같다.
		System.out.println(clazz == clazz2);
		System.out.println(clazz.equals(clazz3));
		
		System.out.println(clazz.getName());//car클래스의 전체 이름 얻기
		System.out.println(clazz.getSimpleName()); //클래스 이름만 얻기
		System.out.println(clazz.getPackage());//패키지 이름 얻기
		
	}
}
