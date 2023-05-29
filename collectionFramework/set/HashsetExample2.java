package collectionFramework.set;

import java.util.HashSet;
import java.util.Objects;

public class HashsetExample2 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("david", 10));
		set.add(new Person("david", 10));
		
		System.out.println(set);
	}

}

//equals()와 hashcode()를 오버라이딩해야 hashset이 올바르게 동작
class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}

	@Override
	public int hashCode() {
		//int hash(object...values) 가변인자
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		//obj 매개변수의 데이터타입이 Person인지 확인. 아니라면 false
		if(!(obj instanceof Person)) { return false;}
		//Person type이 맞다면 obj를 형변환하고 
		Person p = (Person)obj; //형변환 안해주면 obj객체에는 name과 age과 없기때문에 컴파일 오류 발생 (다형성)
		//나자신의 name 과 age를 p 객체와 비교  
		return this.name.equals(p.name) && this.age == p.age;
	}
	
	
	
	
}