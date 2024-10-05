package CH01.VariableType;

public class VariableType_1 {
    public static void main(String[] args) {
        // 1. 변수 사용하기
        System.out.println("** 변수 사용하기 **");
        int age = 20; // 20이라는 값을 담는 메모리 공간에 age라는 이름 붙임, 자료형은 int(정수)
        String country = "Korea";
        // 변수를 선언하여 위와 같이 다른 부분에서도 재사용할 수 있다.

        System.out.println(age);
        System.out.println(country); // 화면 출력

        // 2. 변수 이름 규칙
        System.out.println("** 변수 이용 규칙 **");

        // 2-1. 문자, 숫자, _(underscore), $ 사용 가능
        int apple = 2000;
        int apple3 = 3000;
        int _apple = 4000;
        int $apple = 5000;

        System.out.println(apple); // 2000 출력
        // soutv : 변수 포맷에 맞게 출력
        // "문자열" 뒤의 +는 해당 문자열 뒤의 내용을 이어서 출력하게 해준다.
        System.out.println("apple = " + apple); // apple : 2000 출력
        System.out.println(apple3);
        System.out.println(_apple);
        System.out.println($apple);

        // 2-2. 숫자로 시작 X
        //int 3apple = 2000; // 에러 발생하여 App 실행 안됨

        // 2-3. 대소문자 구분
        int Apple5 = 1000;
        int apple5 = 2000; // Apple5와 apple5는 서로 다른 변수로 인식

        // 2-4. 공백 사용 X
        //int one apple = 1000; // 공백 사용불가. 에러 발생하여 App 실행 안됨
        int oneApple = 1000; // 공백 대신 카멜표기법으로 사용 가능

        // 2-5. 예약어 사용 X
        // 예약어 : Java에서 기본적으로 사용하고자 사전 설정한 키워드
        // 예약어 예시 : true, false, if, for, continue, break ...
        //int if = 100; // if는 조건문에서 사용하는 예약어이기 때문에 에러 발생. App 실행 안됨.

        // 참고) 변수명 한글 사용 가능 (권장하지 않음)
        int 사과 = 1111;
        System.out.println(사과);

        // 3. 표기법
        // 3-1. 카멜 표기법 (camelCase)
        // 주로 변수, 함수에서 사용
        int myAge = 31;
        int oneApplePrice = 3200;

        // 3-2. 파스칼 표기법 (PascalCase)
        // 주로 클래스 명명에서 사용
        int MyAge = 31;
        int OneApplePrice = 3200;

        // 참고) 스네이크 표기법 (snake_case)
        // 모든 단어는 소문자, 단어와 단어 사이는 _(언더바)로 연결
        // 예시만 (Java에서는 주로 사용 X)
        int my_age = 31;
        int one_apple_price = 3200;

    }
}
