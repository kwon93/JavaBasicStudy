package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExample3 {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
						new Student("홍길동", 3, 300),
						new	Student("고길동", 1, 200),
						new	Student("최길동", 2, 100),
						new	Student("이길동", 2, 150),
						new	Student("박길동", 3, 250),
						new	Student("오길동", 3, 100)
						
				);
		studentStream.sorted(Comparator.comparing(Student::getBan) // 반 기준 정렬
				.thenComparing(Comparator.naturalOrder()).reversed()) //역순 정렬
				.forEach(i -> System.out.println(i));
		
		// 스트링 배열의 요소들을 스트링 스트림으로 만들기
		
		String[] arr = {
				"Believe or not It is ture",
				"Do ro do not There is no try"
		};
		
		Stream<String> strStream = Arrays.stream(arr);
		strStream.flatMap(line -> Stream.of(line.split(" +")))// 정규식 하나 의상의 공백
		.map((s)-> s.toLowerCase())
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
	}

}
class Student implements Comparable<Student>{
	String name;
	int ban;
	int score;
	
	
	public Student(String name, int ban, int score) {
		this.name = name;
		this.ban = ban;
		this.score = score;
	}


	public String getName() {
		return name;
	}
	
	public int getBan() {
		return ban;
	}

	public int getScore() {
		return score;
	}


	@Override
	public int compareTo(Student o) {
		return o.score - this.score;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d, %d", name, ban, score);
	}
	
}
