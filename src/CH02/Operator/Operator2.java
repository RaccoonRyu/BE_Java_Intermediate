package CH02.Operator;

public class Operator2 {
    public static void main(String[] args) {
        // 여러가지 연산자 2
        // 2진법과 비트 연산자
        // 2진법 : 컴퓨터에서 데이터 표현에 사용하는 2를 기반으로 한 숫자 체계
        // 2의 보수 : 2의 제곱수에서 빼서 얻은 이진수 (ex. 이진수 3(11)의 2의 보수는 1(01)이다.)

        // 1. 비트 논리 연산자
        System.out.println("** 비트 논리 연산자");
        // 1-1. AND 연산자 (&) - 비교하는 두개의 비트 중 둘 다 1이면 1, 그 외에는 0
        System.out.println("** & AND ** ");
        int num1 = 5;
        int num2 = 3;
        int result = 0;
        
        result = num1 & num2;
        System.out.println("result = " + result); // and 연산의 결과 1 출력
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));// 4비트 포맷에 맞게 이진수 표현하여 출력. 0001

        // 1-2. OR 연산자 (|) - 비교하는 두개의 비트 중 하나라도 1이라면 1, 둘 다 0이면 0
        System.out.println("** | OR ** ");
        result = num1 | num2;
        System.out.println("result = " + result); // or 연산의 결과 7 출력
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));// 4비트 포맷에 맞게 이진수 표현하여 출력. 0111

        // 1-3. XOR 연산자 (^) - 비교하는 두개의 비트가 같은 경우에는 0, 다른 경우에는 1로 연산
        System.out.println("** ^ XOR ** ");
        result = num1 ^ num2;
        System.out.println("result = " + result); // xor 연산의 결과 6 출력
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));// 4비트 포맷에 맞게 이진수 표현하여 출력. 0101

        // 1-4. 반전 연산자 (~) - 비트가 0이면 1, 1이면 0으로 반전
        System.out.println("** ~ 반전 ** ");
        num1 = 5;
        result = ~num1;
        System.out.println("result = " + result); // -6
        System.out.printf("%s\n", Integer.toBinaryString(result)); // 앞에 부호비트가 전부 1로 (32bit 중 28bit) 바뀌어 음수 표현

        // 2. 비트 이동 연산자
        System.out.println("** 비트 이동 연산자 **");
        // 2-1. << 연산자
        int numA = 3;
        result = numA << 1;
        System.out.println("result = " + result); // 6 출력
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // 0011이 좌측으로 shift되어 0110 출력

        // 2-2. >> 연산자
        result = numA >> 1;
        System.out.println("result = " + result); // 1 출력
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // 0011이 우측으로 shift되어 0001 출력

        // 2-3. >>> 연산자
        numA = -5;
        result = numA >> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA)); // 11111111111111111111111111111011 출력
        System.out.printf("%s\n", Integer.toBinaryString(result)); // 11111111111111111111111111111101 출력 (부호비트 1 유지)

        result = numA >>> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA)); // 11111111111111111111111111111011 출력
        System.out.printf("%s\n", Integer.toBinaryString(result)); // 1111111111111111111111111111101 출력 (가장 앞 자리 비트는 0으로 채움. 앞자리 0은 생략)
    }
}
