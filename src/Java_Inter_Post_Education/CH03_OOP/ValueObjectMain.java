package Java_Inter_Post_Education.CH03_OOP;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueObject valueObj = new ValueObject();

        // 인스턴스의 메서드는 멤버 변수를 사용하는 방법과 동일하게 . (dot)을 사용하여 객체에 접근한 다음 원하는 메서드를 호출한다.
        valueObj.add();
        valueObj.add();
        valueObj.add();
        System.out.println("최종 숫자 = " + valueObj.value); // 3 출력
    }
}
