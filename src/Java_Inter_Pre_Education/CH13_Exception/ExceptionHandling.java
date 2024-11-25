package Java_Inter_Pre_Education.CH13_Exception;

import java.io.IOException;

// 사용자 정의 예외 작성
// class 예외명 extends Exception
class NotTenException extends RuntimeException { }

public class ExceptionHandling {

    public static boolean checkTen(int ten) {
        if(ten != 10) {
            return false;
        }
        return true;
    }

    // 예외를 발생(및 처리)시키는 함수
    public static boolean checkTenWithException(int ten) {
        try {
            if(ten != 10) {
                throw new NotTenException(); // 위에서 작성한 사용자 정의 예외를 발생시킴
            }
        } catch (NotTenException e) {
            System.out.println("e = " + e);
            return false;
        }
        return true;
    }

    // 함수가 호출된 곳에 예외를 전가시키는 함수
    public static boolean checkTenWithThrows(int ten) throws NotTenException { // 해당 메서드에서 예외처리 하지 않고 throws 사용하여 해당 함수가 호출된 곳(여기서는 main)으로 예외 전가
        if(ten != 10) {
            throw new NotTenException(); // 위에서 작성한 사용자 정의 예외를 발생시킴
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        // 예외 처리
        // 1. 예외
        // 예외 : 정상적이지 않은 Case(ex. 0으로 나누기, 배열의 인덱스 초과, 없는 파일 열기 등...)
        // 예외 처리 : 정상적이지 않은 Case에 대한 적절한 처리 방법 (try ~ catch 문) (try 예외가 발생할 수 있는 코드 catch 예외를 처리할 코드)

        // 1-1. 0으로 나누기
        System.out.println("** 0으로 나누기 **");
        //int a = 5/0; // 예외처리하지 않으면 java.lang.ArithmeticException: / by zero 예외 발생

        try {
            int a = 5/0;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누기 예외 발생");
            System.out.println("e = " + e);
        } finally { // 아래 코드는 예외가 발생하든 안 하든 무조건 실행됨
            System.out.println("1-1 연습 종료.");
        }

        // 1-2. 배열 인덱스 초과
        System.out.println("** 배열 인덱스 초과 **");
        int[] b = new int[4]; // 배열의 크기가 총 4
        //b[4] = 1; // 배열에 없는 5번째 원소에 값 대입하는 예외. 예외처리하지 않으면 java.lang.ArrayIndexOutOfBoundsException: 4 예외 발생
        
        try {
            b[4] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("e = " + e);
        }

        // 1-3. 없는 파일 열기
        System.out.println("** 없는 파일 열기 **");
        //BufferedReader br = new BufferedReader(new FileReader("abc.txt")); // 존재하지 않는 파일을 입력하기 때문에 예외
        // 예외처리하지 않으면 java.io.FileNotFoundException: abc.txt (지정된 파일을 찾을 수 없습니다) 예외 발생

        // 2. throw, throws
        // throw : 예외를 발생 시킴 / throws : 예외를 전가 시킴
        System.out.println("** checkTen **");
        boolean checkResult = ExceptionHandling.checkTen(10);
        System.out.println("checkResult = " + checkResult);

        System.out.println("** checkTenWithException **"); // 예외 발생 예제
        checkResult = ExceptionHandling.checkTenWithException(8); // 숫자가 10이 아니므로 위에서 작성한 사용자 정의 예외(NotTenException) 발생
        System.out.println("checkResult = " + checkResult); // checkTenWithException() 내부의 예외 처리 로직에 작성된 예외 메시지와 반환된 값 false 출력

        System.out.println("** checkTenWithThrows **"); // 예외 전가 예제
        try {
            checkResult = checkTenWithThrows(5); // 숫자가 10이 아니므로 위에서 작성한 사용자 정의 예외(NotTenException) 발생
        } catch (NotTenException e) {
            System.out.println("e = " + e); // checkTenWithThrows() 메서드가 예외를 처리하지 않아 해당 부에서 예외 처리
        }
        System.out.println("checkResult = " + checkResult);

    }
}
