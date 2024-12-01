package Java_Inter_Post_Education.CH03_OOP;

public class ValueObject {
    // Java같은 객체 지향 언어는 클래스 내부에 속성(데이터)인 value와 해당 데이터를 사용하는 기능(메서드)인 add()메서드를 함께 정의할 수 있다!
    int value;

    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
