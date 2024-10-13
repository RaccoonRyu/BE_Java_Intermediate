package CH14.Collection;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // 컬렉션 프레임워크
        // 여러 데이터를 편리하게 관리할 수 있게 만들어 놓은 것 -> 자료구조 및 알고리즘을 구조화
        // 대표적으로 List, Set, Map 인터페이스가 있음

        // 1. List 인터페이스
        // 순서가 있는 데이터의 집합
        // 데이터 중복 허용
        // 대표 구현 클래스 : ArrayList, LinkedList, Vector

        // 1-1. ArrayList
        System.out.println("** ArrayList **");
        ArrayList list1 = new ArrayList(); // ArrayList 객체 생성
        list1.add(1);
        list1.add(2);
        list1.add(3); // add()를 통한 데이터 추가
        System.out.println("list1 = " + list1); // [1, 2, 3] 출력
        list1.remove(Integer.valueOf(2)); // remove()를 통해 2라는 데이터를 삭제
        System.out.println("list1 = " + list1); // [1, 3] 출력
        list1.add(0, 10); // add 시 데이터를 넣고자 하는 인덱스를 지정 (여기서는 0)
        System.out.println("list1 = " + list1); // [10, 1, 3]
        System.out.println("list1.size() = " + list1.size()); // ArrayList의 사이즈를 반환하는 size(). 3 출력
        System.out.println("list1.contains(1) = " + list1.contains(1)); // ArrayList 안에 데이터가 들어있는지를 확인하는 contains(). true 출력
        System.out.println("list1.indexOf(10) = " + list1.indexOf(10)); // ArrayList 안에 10이라는 값의 인덱스를 반환하는 indexOf(). 0 출력

        // 1-2. LinkedList
        System.out.println("** LinkedList **");
        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3); // add()를 통한 데이터 추가
        System.out.println("list2 = " + list2); // [1, 2, 3] 출력
        list2.addFirst(10); // 가장 처음 인덱스에 데이터 추가
        list2.addLast(20); // 가장 마지막 인덱스에 데이터 추가
        System.out.println("list2 = " + list2); // [10, 1, 2, 3, 20] 출력
        list2.remove(Integer.valueOf(1)); // remove()를 통해 1이라는 데이터를 삭제
        System.out.println("list2 = " + list2); // [10, 2, 3, 20] 출력
        list2.removeFirst(); // 가장 처음 인덱스의 데이터 삭제
        list2.removeLast(); // 가장 마지막 인덱스의 데이터 삭제
        System.out.println("list2 = " + list2); // [2, 3] 출력
        System.out.println("list2.size() = " + list2.size()); // LinkedList의 사이즈를 반환하는 size(). 2 출력

        // 2. Set 인터페이스
        // 순서가 없는 데이터의 집합
        // 데이터의 중복을 허용하지 않음
        // 대표 구현 클래스 : HashSet, TreeSet

        // 2-1. HashSet
        System.out.println("** HashSet **");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3); // add()를 통한 데이터 추가
        System.out.println("set1 = " + set1); // [1, 2, 3] 출력
        set1.remove(1); // 인덱스가 아닌 값으로 바로 인식하여 1이라는 데이터를 삭제
        System.out.println("set1 = " + set1); // [2, 3] 출력
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1); // 중복을 허용하지 않기 때문에 위에서 2와 3을 추가해도 그대로 [2, 3] 출력
        System.out.println("set1.size() = " + set1.size()); // HashSet의 사이즈를 반환하는 size(). 2 출력
        System.out.println("set1.contains(2) = " + set1.contains(2)); // HashSet안에 데이터가 들어있는지를 확인하는 contains(). true 출력

        // 2-2. TreeSet
        // 탐색에 특화된 자료구조
        System.out.println("** TreeSet **");
        TreeSet set2 = new TreeSet();
        set2.add(1);
        set2.add(2);
        set2.add(3); // add()를 통한 데이터 추가
        System.out.println("set2 = " + set2); // [1, 2, 3] 출력
        set2.remove(1); // 인덱스가 아닌 값으로 바로 인식하여 1이라는 데이터를 삭제
        System.out.println("set2 = " + set2); // [2, 3] 출력
        set2.clear(); // TreeSet의 모든 데이터를 삭제
        System.out.println("set2 = " + set2); // [] (빈 set) 출력
        set2.add(10);
        set2.add(5);
        set2.add(15);
        set2.add(15); // 중복을 허용하지 않기 때문에 15는 set에 한번만 들어감
        System.out.println("set2 = " + set2); // [5, 10, 15] 출력
        System.out.println("set2.first() = " + set2.first()); // TreeSet의 최초 값. 5 출력
        System.out.println("set2.last() = " + set2.last()); // TreeSet의 가장 마지막 값. 15 출력
        System.out.println("set2.lower(10) = " + set2.lower(10)); // lower() : TreeSet에서 lower()의 매개변수로 넣은 값(10)보다 작은 값. 5 출력
        System.out.println("set2.higher(10) = " + set2.higher(10)); // higher() : TreeSet에서 higher()의 매개변수로 넣은 값(10)보다 큰 값. 15 출력

        // 3. Map 인터페이스
        // 키(Key)와 값(Value)의 쌍으로 이루어진 데이터 집합
        // 순서를 유지하지 않음 (키값으로 데이터를 수정하거나 액세스하므로 순서 없음)
        // 대표 구현 클래스 : HashMap, TreeMap

        // 3-1. HashMap
        System.out.println("** HashMap **");
        HashMap map1 = new HashMap();
        map1.put(1, "kiwi");
        map1.put(2, "apple");
        map1.put(3, "mango"); // put(K, V)를 통한 데이터 추가
        System.out.println("map1 = " + map1); // map1 = {1=kiwi, 2=apple, 3=mango} 출력

        map1.remove(2); // remove(Key) : Key를 이용하여 데이터 삭제
        System.out.println("map1 = " + map1); // map1 = {1=kiwi, 3=mango} 출력
        System.out.println("map1.get(1) = " + map1.get(1)); // get(Key) : Key를 이용하여 데이터 꺼냄

        // 3-2. TreeMap
        System.out.println("** TreeMap **");
        TreeMap map2 = new TreeMap();
        map2.put(10, "kiwi");
        map2.put(20, "apple");
        map2.put(30, "mango"); // put(K, V)를 통한 데이터 추가
        System.out.println("map2 = " + map2); // map2 = {10=kiwi, 20=apple, 30=mango} 출력

        System.out.println(map2.firstEntry()); // TreeMap의 최초 값. 10=kiwi 출력
        System.out.println(map2.firstKey()); // TreeMap의 최초 키(Key). 10 출력
        System.out.println(map2.lastEntry()); // TreeMap의 마지막 값. 30=mango 출력
        System.out.println(map2.lastKey()); // TreeMap의 마지막 키(Key). 30 출력
        System.out.println(map2.lowerEntry(20)); // 매개변수로 넣은 값(20)보다 작은 값. 10=kiwi 출력
        System.out.println(map2.higherEntry(20)); // 매개변수로 넣은 값(20)보다 큰 값. 30=mango 출력

    }
}
