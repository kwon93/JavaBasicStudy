package stream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
	//스트림으로 난수 만들기.
		IntStream intStream = new Random().ints(1,45);
		intStream.limit(6).forEach(i-> System.out.print(i+","));
		//limit 이 없으면 다섯개만 출력이 아니라 무한으로 나오게됨.
		
		//iterate() 는 이전 요소를 seed로 해서 다음 요소를 계산한다. seed, lambda expression
		IntStream intStream2 = IntStream.iterate(0, n -> n+2);
		intStream2.limit(20).forEach(i -> System.out.println(i));
		
		//generate()는 seed를 사용하지 않는다. 
		DoubleStream dStream = DoubleStream.generate(() -> 2.5+2);
		dStream.limit(3).forEach(System.out::println);
	}

}
