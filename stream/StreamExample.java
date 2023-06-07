package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream(); // 스트림 만들기
		intStream.forEach(i -> System.out.print(i)); //최종연산 후 스트림 닫힘
		System.out.println();
		
		Stream<String> strStream = Stream.of("a","b","c");
		strStream.forEach(i -> System.out.print(i));
		
		System.out.println();
		Stream<String> strStream2 = Stream.of(new String[] {"a","b","c","d"});
		strStream2.forEach(System.out::print);
		
		System.out.println();
		
		int[] arr = {1,2,3,4,5,6,7}; //기본형 배열을 스트림으로 이용할때에는
		IntStream intStream1 = Arrays.stream(arr);
//		intStream1.forEach(i -> System.out.print(i));
		System.out.println("count: "+intStream1.average());
		//기본형 스트림 longStream... 등등 
		//기본형 스트림에서 count(), sum(),average() 등등 메서드 사용이 가능하다.
		//스트림의 타입이 숫자인것을 알기 때문.
		
		
		
	}

}
