package CH12.InputOutput;

import java.io.IOException;
import java.util.Scanner;

public class InputOutput1 {
    // 많이 사용되지는 않지만, 1-1 참고를 위한 함수 referInputStream
    public static void referInputStream() throws IOException {
        // 입력
        // System.In
        /*System.out.println("** System.in **");
        System.out.print("입력 : ");
        int a = System.in.read() - '0'; // System.in.read()를 통해 받아온 캐릭터 값(아스키 코드 값) 하나를 - 0 해주어 숫자로 변환
        System.out.println("a = " + a);
        System.in.read(new byte[System.in.available()]); // 입력 스트림에 남아있는 개수 만큼 바이트 형태로 읽어 데이터(뒤에 남는 엔터키)를 없애주는 코드*/

        // InputStreamReader
        /*System.out.println("** InputStreamReader");
        InputStreamReader reader = new InputStreamReader(System.in); // InputStreamReader 객체 생성시 매개변수는 System.in
        char[] c = new char[3]; // InputStreamReader에 입력할 데이터를 받을 배열 생성 (여러 개의 글자. 여기서는 3글자)
        System.out.print("입력 : ");
        reader.read(c); // 실제 데이터를 입력하는 부분. 위에서 만든 배열을 매개변수로 넘기면 입력한 데이터를 해당 배열에 넣어줌
        System.out.println(c);*/

        // BufferedReader
        /*System.out.println("** BufferedReader **");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체는 매개변수로 new InputStreamReader(System.in)를 생성하여 넘겨줌
        System.out.print("입력 : ");
        String s1 = br.readLine(); // 데이터 입력 부
        System.out.println("s1 = " + s1);*/
    }

    public static void main(String[] args) throws IOException {
        // 입출력 1
        // 콘솔 입/출력

        // 1. 입력
        // 1-1. 다른 입력 방식 (참고)
        referInputStream();

        // 1-2. Scanner
        System.out.println("** Scanner **");
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성시 매개변수는 System.in
        System.out.print("입력 1 : ");
        System.out.println(sc.next()); // data를 입력하여 바로 출력
        sc.nextLine(); // data 입력 후 Enter키 소진을 위한 코드

        System.out.println("입력 2 : ");
        System.out.println(sc.nextInt()); // Integer data만 입력 가능. 그렇지 않은 경우 Error 발생
        sc.nextLine();

        System.out.println("입력 3 : ");
        System.out.println(sc.nextLine()); // 가장 많이 사용하는 방법. BufferedReader처럼 자유자재로 data 입력 가능

        // 참고) 정수, 문자열 변환 - 자주 쓰임
        int num = Integer.parseInt("1234"); // String to int
        String str = Integer.toString(1234); // int to String

        // 2. 출력
        System.out.println("** 출력 **");
        System.out.println("Hello");
        System.out.println("World"); // 개행을 포함한 출력

        System.out.print("Hello ");
        System.out.print("World!"); // 개행 없이 출력
        System.out.println();

        System.out.printf("Hello ");
        System.out.printf("World!"); // 포맷을 지정한 다음, 해당 포맷에 맞춰 출력 (포맷 없는 경우 print와 동일하게 출력)
        System.out.println();

        // printf 심화
        String s = "자바";
        int number = 3;

        System.out.println(s + "는 언어 선호도 " + number + "위 입니다.");
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number); // 문자열(%s), 정수(%d) 포맷을 사용하여 출력. 개행이 없으므로 문장 끝에 \n 추가

        // 서식 문자
        System.out.printf("%d\n", 10); // 정수형
        System.out.printf("%o\n", 10);// 8진수
        System.out.printf("%x\n", 10);// 16진수

        System.out.printf("%f\n", 5.2f); // 실수. 뒤에 소숫점f

        System.out.printf("%c\n", 'A'); // 문자값(문자 1개)
        System.out.printf("%s\n", "안녕하세요."); // 문자열

        System.out.printf("%5d\n", 123); // 5개 자릿수를 확보한 후 123 출력 ex)  123
        System.out.printf("%5d\n", 1234); // 5개 자릿수를 확보한 후 1234 출력
        System.out.printf("%5d\n", 12345); // 5개 자릿수를 확보한 후 12345 출력
        // 이 때 정렬은 우측 정렬이고, 좌측 정렬을 원하는 경우 숫자 앞에 - 입력
        System.out.printf("%-5d\n", 123); // 좌측 정렬된 123   출력

        System.out.printf("%.2f\n", 1.123451234f); // 소수 두번째 짜리까지 반올림하여 출력. 1.12
    }
}
