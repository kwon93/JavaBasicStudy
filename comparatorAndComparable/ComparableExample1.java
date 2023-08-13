package comparatorAndComparable;

public class ComparableExample1 implements Comparable<ComparableExample1>{

    //예제를 위한 간단한 사람 객체를 구현해보자.
    int age;	 // 나이
    String name; // 이름

    public ComparableExample1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(ComparableExample1 o) {
        //자기 자신이 비교 객체보다 크다면 양수
        if (this.age > o.age){
            return 1;
        }else if (this.age == o.age){ //자기 자신과 같다면 0
            return 0;
        }else { //자기 자신이 더 작다면 음수를 반환한다.
            return -1;
        }
    }
}
