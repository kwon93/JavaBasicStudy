package abstract_.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound(); // 각자 클래스에서 재정의한 메소드가 호출된다.
		cat.sound();
		
		Animal a = null;
		a = new Dog(); //애니멀이라는 데이터타입에 Dog이라는 객체로 타입 변환
		a.sound(); // dog클래스의 메소드 호출 
		
		animalSound(cat); // animalSound라는 메소드에 cat이라는 객체를 매개변수로 사용 cat의 sound출력
		
	}
	public static void animalSound(Animal a1) {
		a1.sound();
	}
}
