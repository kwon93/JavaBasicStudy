# Lamda Expression

**Lamda Expression :** 함수 (Method) 를 간단한 식으로 표현하는 방법.

*ex)*

```java
int max(int a, int b){
	return a > b ? a : b ;
} // 일반적인 java method

(a,b) -> a > b ? a : b 
//lamda expression. 
```

익명 함수로도 불린다. 이름이 없고 반환타입이 없다. '→' 를 {} 블럭앞에 추가한다. 반환값이 있는 경우 return문 생략가능, 매개변수의 타입이 추론 가능하면 생략가능 

*Lamda는 사실 익명 객체다.* object 를 참조 

**함수형 인터페이스 :** 단 하나의 Abstract Method 만 선언된 인터페이스, 람다식을 다루기위해 사용됨.
