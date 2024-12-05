package Java_Inter_Post_Education.CH10_Poly.basic;

// 다운캐스팅을 자동으로 지원하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        Parent parent2 = new Parent(); // 부모 타입으로 객체를 생성했기 때문에 메모리에 자식타입이 존재하지 않음(부모 타입만 존재)
        Child child2 = (Child) parent2; // 런타임 오류 - 사용할 수 없는 타입(여기서는 Child)으로 다운캐스팅하여 ClassCastException 예외 발생
        child2.childMethod(); // 실행 불가
    }
}
