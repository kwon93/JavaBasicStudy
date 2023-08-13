package comparatorAndComparable;

import java.lang.reflect.Type;
import java.util.Comparator;

public class ComparatorExample1 implements Comparator<ComparatorExample1> {

    //예제를 위한 간단한 사람 객체를 구현
    int age;	 // 나이
    String name; // 이름


    @Override
    public int compare(ComparatorExample1 o1, ComparatorExample1 o2) {
        //o1이 o2보다 크다면 양수
        if (o1.age > o2.age){
            return 1;
        }else if (o1.age == o2.age){ //o1과 o2가 같다면 0
            return 0;
        }else { // o1이 o2 보다 작다면 음수
            return -1;
        }
    }
}
