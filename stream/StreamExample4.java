package stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample4 {

	public static void main(String[] args) {
		String[] strArr = {
				"inheritance","java","lambda","stream"
				,"Optionanl","IntStream","count","sum"
		};
		//strArr을 Stream으로 만들고 병렬방식으로(멀티쓰레드) 순차적 출력.
		Stream.of(strArr).parallel().forEach(System.out::println);
		
		//strArr이 전부 비어있지 않다면 true출력.
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s-> s.length() == 0);
		System.out.println(noEmptyStr);
		
		//
		Optional<String> sWord = Stream.of(strArr).filter(i -> i.charAt(0) == 's')
				.findFirst();
		System.out.println(sWord.get());
		
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		int count = intStream1.reduce(0, (a,b)-> a + 1);
		System.out.println(count);
		
		OptionalInt max = intStream2.reduce(Integer::max);
		OptionalInt min = intStream3.reduce(Integer::min);
		
		System.out.println(max.getAsInt());
		System.out.println(min.getAsInt());
	}

}
