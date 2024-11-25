package Java_Inter_Pre_Education.CH01_VariableType;

public class VariableType_2 {
    public static void main(String[] args) {
        // 변수와 자료형 2
        // 1. 자료형 - 숫자
        System.out.println("** 숫자 **");

        // 1-1. 정수
        int intNum = 10;
        System.out.println("intNum : " + intNum);
        // Java에서는 상수를 대문자 스네이크 표기법으로 표현함
        System.out.println(Integer.MIN_VALUE); // Integer : 기본타입 + 추가 기능 여러 개
        System.out.println(Integer.MAX_VALUE); // 정수의 최소-최댓값

        int intNum2 = Integer.MAX_VALUE;
        int intNum3 = Integer.MAX_VALUE + 1;
        System.out.println("intNum3 = " + intNum3); // int의 범위를 초과하여 overflow가 발생해 -2147483648 출력

        // int의 범위를 초과하는 수를 담기 위해서는 long 자료형 사용
        // 이 때, (long)으로 형 변환을 하지 않으면 -2147483648 그대로 longNum에 들어가기 때문에 형변환 후 +1
        long longNum = (long) Integer.MAX_VALUE + 1;
        System.out.println("longNum = " + longNum); // 정상적으로 int 범위 초과하는 값 출력

        // 1-2. 실수
        // float 자료형에는 대입하려는 값 뒤에 f를 붙여야 float형으로 인식함. (안 적으면 double로 인식)
        float floatNum = 1.23f;
        // double 자료형은 뒤에 아무런 문자도 붙이지 않는다.
        double doubleNum = 1.23;

        System.out.println(Float.MAX_VALUE); // 뒤의 E38은 10의 38제곱을 의미
        System.out.println(Double.MAX_VALUE); // 뒤의 E308은 10의 308제곱을 의미

        // 1-3. 2진수 / 8진수 / 16진수
        // 10진수 : 12를 아래와 같이 표현
        int numBase2 = 0b1100;
        int numBase8 = 014;
        int numBase16 = 0xC;
        System.out.println(numBase2);
        System.out.println(numBase8);
        System.out.println(numBase16); // 출력은 전부 10진수의 12로 출력됨을 확인

        System.out.println("2진수 : " + Integer.toBinaryString(numBase2)); // 이진수 모양 그대로 출력
        System.out.println("8진수 : " + Integer.toOctalString(numBase8)); // 팔진수 모양 그대로 출력
        System.out.println("16진수 : " + Integer.toHexString(numBase16)); // 16진수 모양 그대로 출력

        // 2. 자료형 - 부울
        System.out.println("** 부울 **");
        boolean isPass = true;
        boolean isOk = false;
        System.out.println(isPass); // true 그대로 출력

        // 3. 자료형 - 문자
        System.out.println("** 문자 **");
        // 문자는 char(캐릭터) 자료형을 사용하며, 작은 따옴표 안에 한 개의 문자만을 포함한다.
        char keyFirst = 'a';
        System.out.println("keyFirst = " + keyFirst);
        char keyLast = 'z';
        System.out.println("keyLast = " + keyLast);

        // 문자 자료형은 int로 형 변환하면 해당 문자의 유니코드 값(아스키 코드 포함)을 표현한다.
        System.out.println((int) keyFirst);
        System.out.println((int) keyLast);

    }
}
