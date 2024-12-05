package Java_Inter_Post_Education.CH10_Poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();

        // 단 자식의 기능은 호출할 수 없다.
        // poly.childMethod(); // 컴파일 오류

        // 자식 기능의 호출을 위한 다운 캐스팅
        // 호출하는 타입을 부모 타입에서 자식 타입으로 '내려서' 타입을 변경하는 것!
        Child child = (Child) poly; // 명시적 형변환을 통한 다운 캐스팅
        child.childMethod();

        // 일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅(변수에 할당 X)
        ((Child) poly).childMethod();
    }
}
