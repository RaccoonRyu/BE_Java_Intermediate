package Java_Inter_Pre_Education.CH14_Collection;

// Practice
// set을 이용한 로또 번호 만들기

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Collection_Practice {
    public static void main(String[] args) {
        HashSet set = new HashSet(); // 순서 보장되지 않는 set

        for (int i = 0; set.size() < 6; i++) { // 중복되지 않은 데이터가 6개가 될 때 까지 반복문이 수행
            int num = (int)(Math.random() * 45) + 1; // Math.random() * 45 : 0~44 사이의 난수 생성. 뒤에 +1을 하여 범위를 1~45로 변경
            set.add(num); // 위에서 생성한 난수를 set에 add. 이 때 데이터가 중복되면 set에 넣지 않고 size 또한 증가하지 않는다.
        }

        LinkedList list = new LinkedList(set); // 순서 보장을 위해 매개변수로 위에서 생성한 set을 넣어 LinkedList 생성
        Collections.sort(list);
        System.out.println("로또 번호 : " + list); // 6개 숫자가 오름차순으로 순서대로 정렬되어 출력

    }
}
