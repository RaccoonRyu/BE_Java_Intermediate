package Java_Inter_Pre_Education.CH16_Stream;

import java.util.*;
import java.util.stream.*;

// Practice
// 아래 예제를 스트림으로 구현

public class Streams_Practice {
    public static void main(String[] args) {
        // Test Code

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // for Each
        for (int num : arr) {
            if(num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("sum = " + sum); // 30 출력

        // Stream
        IntStream pracStream = Arrays.stream(arr); // 배열 arr을 통한 IntStream 생성
        int sum2 = pracStream.filter(n -> n % 2 == 0).sum(); //
        System.out.println("sum2 = " + sum2); // 30 출력
    }
}
