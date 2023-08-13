# Comparator&Comparable

- 객체 정렬에 필요한 메서드(정렬 기준 제공)를 정의한 인터페이스
    - Comparable : 기본 정렬기준을 구현하는데 사용.
    - Comparator : 기본 정렬기준외에 다른 기준으로 정렬하고자 할 때 사용.
    
    ```java
    public interface Comparator{
    	int compare(Object o1, Object o2); // o1, o2 두 객체를 비교
    // 결과가 0이면 같다. 양수 : 왼쪽이 크다, 음수: 오른쪽이 크다.
    	boolean equals(Object obj); // equals()를 오버라이딩하라는 뜻.
    }
    
    public interface Comparable{
    	int compareTo(Object o); // 주어진 객체를 자신(this)과 비교.
    }
    ```
    

정렬이란 sort() : 자리 바꿈이다. 두 대상을 비교해서 자리를 바꾸는 것을 반복
