package Java_Inter_Pre_Education.CH03_Conditional;

public class IfSwitch {
    public static void main(String[] args) {
        // 조건문
        // 1. if
        System.out.println("** if **");
        int waterTemp = 99;

        if (waterTemp >= 100) {
            System.out.println("물이 끓습니다.");
        } else {
            System.out.println("물을 끓이는 중입니다.");
        }
        // 물을 끓이는 중입니다. 출력

        int score = 90;
        char grade = 0;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("grade = " + grade); // A 출력

        // 2. switch
        System.out.println("** switch **");

        String fruit = "apple";

        switch (fruit) {
            case "apple" :
                System.out.println(fruit + "은 5000원 입니다.");
                break;
            case "blueberry" :
                System.out.println(fruit + "은 10000원 입니다.");
                break;
            default:
                System.out.println("해당 과일이 없습니다.");
                break;
        }
        // apple은 5000원 입니다. 출력

        // Q1. number의 값이 홀수인지 짝수인지 판단하는 코드를 작성
        int num = 5;

        if (num % 2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
        // 홀수 입니다. 출력

        // Q2. 아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다. 이를 switch 조건문으로 변경하라
        /*
        int score = 90;
        char grade = 0;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("grade = " + grade);
         */

        int testScore = 100;
        char testGrade = 0;

        // switch
        // score를 10으로 나누면 소숫점이 날아간 int가 되므로 85나 99같은 값이 들어와도 8과 9로 계산되어 아래 로직 수행됨
        switch (testScore / 10) {
            case 10 : // break문이 없기 때문에 아래 case 수행
            case 9 :
                testGrade = 'A';
                break;
            case 8 :
                testGrade = 'A';
                break;
            case 7 :
                testGrade = 'A';
                break;
            default:
                testGrade = 'F';
                break;
        }
        System.out.println("testGrade = " + testGrade);
    }
}
