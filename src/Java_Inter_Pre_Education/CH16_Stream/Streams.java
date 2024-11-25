package Java_Inter_Pre_Education.CH16_Stream;

import java.util.*;
import java.util.stream.*;

public class Streams {
    public static void main(String[] args) {
        // 1. 스트림(Stream)
        // 배열, 컬렉션 등의 데이터를 하나씩 참조하여 처리 가능한 기능
        // for문의 사용을 줄여 코드를 간결하게 한다.
        // 크게 Stream 생성/중개 연산/최종 연산 총 3가지로 구성된다.
        // 데이터소스객체.Stream생성().중개연산().최종연산(); 과 같이 작성한다.

        // 1-1. 배열 스트림
        // String[] arr = new String[]{"a", "b", "c"};
        // Stream stream = Arrays.stream(arr);
        System.out.println("** 배열 스트림 **");
        String[] arr = new String[]{"a", "b", "c"};

        System.out.println("** fori **");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("** forEach **");
        for (String item : arr) {
            System.out.println(item);
        }

        System.out.println("** to Stream **");
        Stream stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println); // 순회하며 출력을 위해 forEach() 사용. a b c 출력

        // 1-2. 컬렉션 스트림
        // ArrayList list = new ArrayList(Arrays.asList(1, 2, 3));
        // Stream stream = list.stream();
        System.out.println("** 컬렉션 스트림 **");
        ArrayList list1 = new ArrayList(Arrays.asList(1, 2, 3));
        System.out.println(list1); // [1, 2, 3] 출력

        Stream stream2 = list1.stream();
        //stream2.forEach(System.out::println); // 1 2 3 출력
        stream2.forEach(num -> System.out.println("num = " + num)); // forEach 안에 포맷을 작성하여 출력

        // 1-3. 스트림 builder
        System.out.println("** 스트림 builder **");
        // builder(), add(), build()를 통해 데이터를 추가하여 stream 생성
        Stream streamBuilder = Stream.builder().add(1).add(2).add(3).build();
        streamBuilder.forEach(System.out::println);

        // 1-4. 스트림 generate
        System.out.println("** 스트림 generate **");
        // 만들고자 하는 데이터를 generate() 내부에 람다식과 유사하게 작성하고, limit(숫자)으로 데이터를 생성할 반복 횟수를 정함.
        Stream streamGenerate = Stream.generate( () -> "abc" ).limit(3);
        streamGenerate.forEach(System.out::println); // abc 세번 출력

        // 1-5. 스트림 iterate
        System.out.println("** 스트림 iterate **");
        // iterator(초깃값, 다음 값 연산식), limit(숫자)으로 데이터를 생성할 반복 횟수를 정함
        Stream streamIterate = Stream.iterate(10, n -> n * 2).limit(3);
        streamIterate.forEach(System.out::println); // 10 20 40 출력

        // 1-6. 기본 타입 스트림
        System.out.println("** 기본 타입 스트림 **");
        // range() : 1~4까지 데이터를 생성 (시작값부터 가장 끝 수-1값 까지의 데이터) cf. rangeClosed()를 사용하면 시작값~끝 수 그대로의 데이터 생성
        IntStream intStream = IntStream.range(1, 5);
        intStream.forEach(System.out::println); // 1 2 3 4 출력

        // 2. 스트림 중개 연산 : 부분 데이터를 추출하거나 연산을 통해 데이터를 변경
        // 2-1. Filtering : filter 내부 조건에 참인 요소들을 추출
        System.out.println("** Filtering **");
        // filter(조건식) : 조건식에 맞는 데이터를 필터링 (여기서는 짝수 값 필터링)
        IntStream intStream2 = IntStream.range(1, 10).filter(n -> n % 2 ==0);
        intStream2.forEach(System.out::println); // 2 4 6 8 출력

        // 2-2. Mapping : map 안의 연산을 요소별로 수행
        System.out.println("** Mapping **");
        // map(연산식) : map 안의 연산식을 Stream 내 요소별로 수행하여 데이터 변경
        IntStream intStream3 = IntStream.range(1, 10).map(n -> n + 1);
        intStream3.forEach(n -> System.out.print(n + " ")); // 2 3 4 5 6 7 8 9 10 출력
        System.out.println();

        // 2-3. Sorting : 정렬
        System.out.println("** Sorting **");
        IntStream intStream4 = IntStream.builder().add(5).add(1).add(3).add(4).add(2).build();
        // sorted() : Stream 내 요소를 정렬
        IntStream intStreamSort = intStream4.sorted();
        intStreamSort.forEach(System.out::println); // 5 1 3 4 2 가 1 2 3 4 5로 잘 정렬되어 출력됨을 확인

        // 3. 스트림 최종 연산 : 결과값을 연산. 최종 연산을 수행하면 그 다음부터는 Stream 연산을 수행할 수 없고 종료됨.
        // 3-1. Sum, Average
        System.out.println("** sum, average **");
        // sum() : 1~4의 데이터를 가진 Stream을 생성 후, 해당 스트림이 가진 모든 값의 합을 구함
        int sum = IntStream.range(1, 5).sum();
        System.out.println("sum = " + sum); // 10 출력
        // average() : ~4의 데이터를 가진 Stream을 생성 후, 해당 스트림이 가진 모든 값의 평균값을 구함
        // getAsDouble() : 가공한 값(여기서는 평균)을 double 형으로 가져오기 위한 함수
        double average = IntStream.range(1, 5).average().getAsDouble();
        System.out.println("average = " + average); // 2.5 출력

        // 3-2. min, max
        System.out.println("** min, max **");
        // min() : 해당 스트림이 가진 값 중 최솟값
        // getAsInt() : 가공한 값(여기서는 최솟값)을 int 형으로 가져오기 위한 함수
        int min = IntStream.range(1, 5).min().getAsInt();
        System.out.println("min = " + min); // 1 출력
        // min() : 해당 스트림이 가진 값 중 최댓값
        int max = IntStream.range(1, 5).max().getAsInt();
        System.out.println("max = " + max); // 4 출력

        // 3-3. reduce
        System.out.println("** reduce **");
        Stream<Integer> stream3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)).stream(); // 스트림 생성
        // reduce(연산식) : Stream 내 요소를 연산식에 따라 연쇄적으로 연산하여 데이터를 가공함
        System.out.println(stream3.reduce((x, y) -> x + y).get()); // 1+2 -> 3/3+3 -> 6/6+4 -> 10/10+5 -> 15의 순서를 통해 15 출력

        // 3-4. forEach
        System.out.println("** forEach **");
        IntStream.range(1, 10).filter(n -> n == 5).forEach(System.out::println); // 5 출력

    }
}
