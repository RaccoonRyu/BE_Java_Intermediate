package Java_Inter_Pre_Education.CH02_Operator;

public class Operator1 {
    public static void main(String[] args) {
        // 여러가지 연산자 1
        // 항 : 연산을 할 때 사용되는 값

        // 1. 대입 연산자, 부호 연산자
        System.out.println("** 대입 연산자 **");
        int num = 100; // 대입 연산자 =를 통해 값 1000 대입
        num = +10;
        num = 10; // + 부호는 생략 가능
        num = -10; // - 부호는 생략 불가

        // 2. 산술 연산자, 증가/감소 연산자
        System.out.println("** 산술 연산자, 증가/감소 연산자 **");
        int numX = 10;
        int numY = 3;
        int result = 0;
        result = numX + numY;
        result = numX - numY;
        result = numX * numY;
        result = numX / numY;
        result = numX % numY;
        System.out.println("result = " + result); // 10에서 3을 나눈 나머지 1 출력

        int numZ = 1;
        System.out.println(numZ++); // 후치 연산자는 증감 전 해당 라인에서 원래의 값(증감 전 값)을 먼저 사용한 후 증감이 수행됨. 1 출력
        System.out.println(numZ); // 2 출력

        numZ = 1;
        System.out.println(++numZ); // 전치 연산자는 해당 라인에서 먼저 값을 증감시키고 사용. 2 출력
        System.out.println(numZ); // 2 출력

        numZ = 1;
        System.out.println(numZ--); // 후치 연산자는 증감 전 해당 라인에서 원래의 값(증감 전 값)을 먼저 사용한 후 증감이 수행됨. 1 출력
        System.out.println(numZ); // 0 출력

        numZ = 1;
        System.out.println(--numZ); // 전치 연산자는 해당 라인에서 먼저 값을 증감시키고 사용. 0 출력
        System.out.println(numZ); // 0 출력

        // 3. 관계 연산자
        System.out.println("** 관계 연산자 **");
        int numA = 10;
        int numB = 9;

        System.out.println(numA > numB); // true 출력
        System.out.println(numA < numB); // false 출력
        System.out.println(numA == numB); // false 출력
        System.out.println(numA != numB); // true 출력

        // 4. 논리 연산자
        System.out.println("** 논리 연산자 **");
        System.out.println((10 > 9) && (1 == 0)); // and는 모든 항이 true여야 참이므로 false 출력
        System.out.println((10 > 9) || (1 == 0)); // or는 둘 중 하나의 항만 true여도 참이므로 true 출력

        // 5. 복합 대입 연산자
        System.out.println("** 복합 대입 연산자 **");
        int num1 = 10;
        int num2 = 5;
        num1 += num2; // num1 = num1 + num2;와 동일한 문장
        System.out.println("num1 = " + num1); // num1의 값에 num2 값을 합하여 num1에 대입함. 15 출력
        // 이 외에도 -=, *= 등의 복합 대입 연산자 있음.

        // 6. 삼항 연산자
        System.out.println("** 삼항 연산자 **");
        int a = 100;
        String aResult = (a == 100) ? "Yes" : "No"; // 물음표 앞의 논리식 결과가 true이면 물음표 뒤 좌측 항의 값을, false이면 물음표 뒤 우측 항의 값을 aResult에 대입
        System.out.println("aResult = " + aResult); // Yes 출력

    }
}
