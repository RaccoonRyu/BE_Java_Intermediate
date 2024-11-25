package Java_Inter_Pre_Education.CH01_VariableType;

public class VariableType_3 {
    public static void main(String[] args) {
        // 변수와 자료형 3
        // 1. 자료형 - 문자열
        System.out.println("** 문자열 **");
        String s1 = "Hello World!";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);

        // 1-1. equals
        // 각 문자열 값의 동등 비교
        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3.equals(s4)); // equals : 문자열 변수가 가지고 있는 값을 비교
        System.out.println(s3 == s4); // == (비교 연산자) : 문자열 변수가 참조하는 객체를 비교
        String s5 = new String("Hi");
        System.out.println(s3.equals(s5)); // 단순히 변수가 가진 값은 같으므로 true
        System.out.println(s3 == s5); // s5는 s3과 달리 새로 생성된 문자열 객체를 참조하는 변수이므로 false

        // 1-2. indexOf
        // 문자열에서 특정 문자의 위치를 찾는 메서드
        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!")); // 5 출력 (인덱스는 0부터 시작하고, 느낌표가 처음 나온 인덱스는 5이다.)
        System.out.println(s6.indexOf("!", s6.indexOf("!")+1)); // 12 출력. 처음 느낌표의 인덱스+1부터 다음 느낌표를 찾음

        // 1-3. replace
        // 문자열 내의 특정 문자열을 다른 문자열로 교체
        String s7 = s6.replace("Hello", "Bye"); // 바뀔 문자열, 바꿀 문자열 순으로 입력
        System.out.println("s7 = " + s7); // Bye! World! 출력

        // 1-4. substring
        // 기존 문자열에서 부분 문자열을 추출
        // 부분 문자열을 추출할 시작과 끝 인덱스를 지정한다.
        System.out.println(s7.substring(0, 3)); // 0~2 인덱스의 문자열인 Bye가 출력

        // 1-5. toUpperCase
        // 문자열의 모든 영문자를 대문자로 변경
        System.out.println(s7.toUpperCase()); // BYE! WORLD! 출력

        // 2. 자료형 - StringBuffer
        System.out.println("** StringBuffer **");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234"); // append를 통해 sb에 내용 추가
        System.out.println("sb1 = " + sb1); // 01234 출력
        sb1.append("56789");
        System.out.println("sb1 = " + sb1); // 0123456789 출력

        // String도 append 가능
        String a = "01234";
        String b = "56789";
        a += b;
        System.out.println(a); // 0123456789 출력

        // StringBuffer의 의의
        // 문자열의 데이터가 자주 변경되거나 중간에 삭제되는 경우가 빈번할 때는 sb를 이용하는게 좋다.
        // sb내의 Data가 변경이 되어도 해당 객체가 새로 만들어지지 않고
        // 추가적인 메모리 자원의 사용 없이 기존 객체의 데이터를 자유롭게 변경할 수 있기 때문이다.
        // * String의 경우에는 변수가 가진 값을 변경할 때 마다 새로운 객체를 생성하기 때문에, 추가적인 메모리 자원 사용이 발생한다.

        // 3. 자료형 - 배열
        System.out.println("** 배열 **");
        int[] intArray = {1, 2, 3, 4, 5}; // 배열 생성과 동시에 초기화
        System.out.println(intArray[0]); // 배열 내 요소를 사용하려면 배열명[인덱스]를 입력한다.
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]); // 순서대로 1, 2, 3, 4, 5 출력

        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(charArray[2]); // c 출력

        String[] strArray = new String[3]; // 배열의 크기만 명시하여 생성 (데이터 없는 빈 배열)
        strArray[0] = "Hello";
        strArray[1] = " ";
        strArray[2] = "World!"; // 배열의 각 인덱스에 값 대입
        System.out.println(strArray[0] + strArray[1] + strArray[2]);
    }
}
