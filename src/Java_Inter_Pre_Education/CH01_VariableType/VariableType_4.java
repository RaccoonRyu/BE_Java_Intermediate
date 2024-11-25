package Java_Inter_Pre_Education.CH01_VariableType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class VariableType_4 {
    public static void main(String[] args) {
        // 변수와 자료형 4
        // 1. 리스트(List)
        // 배열과 같이 여러 데이터를 담을 수 있는 자료형
        // ArrayList list1 = new ArrayList(); 로 생성
        System.out.println("** 리스트 **");
        ArrayList list1 = new ArrayList();

        // 1-1. add
        list1.add(1); // list1에 데이터 저장
        list1.add("hello");
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add("world!");
        System.out.println("list1 = " + list1); // [대괄호]안에 ,로 구분되어 데이터가 저장됨을 확인. 순서 보장

        list1.add(0, 1); // 앞의 숫자는 인덱스, 뒤의 숫자는 값
        System.out.println("list1 = " + list1); // 가장 앞(인덱스 0)에 1이 추가됨을 확인

        // 1-2. get
        System.out.println(list1.get(0)); // list1의 0번 인덱스에 있는 값을 꺼냄
        System.out.println(list1.get(3)); // list1의 3번 인덱스에 있는 값을 꺼냄

        // 1-3. size
        System.out.println(list1.size()); // list1의 데이터 개수(원소 개수) 반환. 7 출력

        // 1-4. remove
        System.out.println(list1.remove(0)); // list1의 0번 인덱스에 있는 값을 지움
        System.out.println(list1.remove(Integer.valueOf(2))); // list1의 2번 인덱스 값이 아니라 list1 내에서 2라는 값을 찾아서 지움
        System.out.println("list1 = " + list1);

        // 1-5. clear
        // list에 있는 모든 값을 지우는 함수
        list1.clear();
        System.out.println("list1 = " + list1);

        // 1-6. sort
        // list 내 데이터 오름차순/내림차순 등으로 정렬
        ArrayList list2 = new ArrayList();
        list2.add(5);
        list2.add(3);
        list2.add(4);
        System.out.println("list2 = " + list2);
        list2.sort(Comparator.naturalOrder()); // Comparator를 이용한 오름차순 정렬
        System.out.println("list2 = " + list2);
        list2.sort(Comparator.reverseOrder()); // Comparator를 이용한 내림차순 정렬
        System.out.println("list2 = " + list2);

        // 1-7. contains
        // 특정 값이 list에 들어있는지 확인하는 함수
        System.out.println(list2.contains(1)); // false
        System.out.println(list2.contains(3)); // true

        // 2. 맵(Map)
        // Key, Value 형태로 데이터를 저장하는 자료형 (데이터 쌍을 이뤄 저장함)
        // HashMap<Key자료형, Value자료형> map = new HashMap<Key자료형, Value자료형>(); 로 생성
        System.out.println("** Maps **");
        HashMap map = new HashMap();

        // 2-1. put
        map.put("kiwi", 9000); // map에 데이터 저장
        map.put("apple", 10000);
        map.put("mango", 12000);
        System.out.println("map = " + map); // 중괄호 사이에 쌍을 이룬 데이터가 저장됨을 확인. 순서 보장하지 않음

        // 2-2. get
        System.out.println(map.get("mandarine")); // mandarine을 키로 가진 데이터가 없으므로 null 출력
        System.out.println(map.get("kiwi")); // kiwi를 키로 가진 데이터가 있으므로 꺼내와서 값 9000 출력

        // 2-3. size
        System.out.println(map.size()); // map의 데이터 개수(원소 개수) 반환. 3 출력

        // 2-4. remove
        // map 안의 데이터 삭제
        System.out.println(map.remove("kiwi")); // kiwi를 키로 가진 데이터 삭제하고 해당 데이터 값 반환 및 출력
        System.out.println(map.remove("mandarine")); // mandarine을 키로 가진 데이터가 없으므로 null 반환 및 출력
        System.out.println("map = " + map); // kiwi 가 지워진 map 출력

        // 2-5. containsKey
        // map 내에 특정 key가 존재하는지를 확인하는 함수
        System.out.println(map.containsKey("apple")); // map에 apple을 키로 갖는 데이터가 있으므로 true 출력
        System.out.println(map.containsKey("kiwi")); // map에 kiwi를 키로 갖는 데이터가 없으므로 false 출력

        // 3. 제네릭스(Generics)
        // 자료형을 명시적으로 지정 (자료형 제한)
        // 제한적일 수 있지만 안정성을 높여주고 형변환을 줄여줌
        // 새 자료형 객체를 생성할 때 앞에 지정한 제네릭스와 뒤에 생성될 자료형의 제네릭스를 일치시켜야 한다.
        System.out.println("** Generics ** ");
        ArrayList list3 = new ArrayList();
        list3.add(1);
        list3.add("hello");
        System.out.println("list3 = " + list3); // 제네릭스 사용하지 않아 자료형 제한 없는 ArrayList

        // 제네릭스 사용
        ArrayList<String> list4 = new ArrayList<String>(); // new 뒤의 제네릭스는 작성 생략하면 앞 제네릭스와 동일(String)
        //list4.add(1); // list4의 자료형이 String으로 제한되기 때문에 add 불가
        list4.add("hello");
        System.out.println("list4 = " + list4);

        HashMap map1 = new HashMap();
        map1.put(123, "id");
        map1.put("apple", 10000);
        System.out.println("map1 = " + map1); // 제네릭스 사용하지 않아 자료형 제한 없는 Map

        HashMap<String, Integer> map2 = new HashMap<>();
        //map2.put(123, "id"); // 위의 제네릭스에서 <String, Integer>로 자료형 제한하므로 put 불가
        map2.put("apple", 10000);
        System.out.println("map2 = " + map2);

    }
}
