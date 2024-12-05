package Java_Inter_Post_Education.CH10_Poly.basic;

// 업캐스팅 vs 다운캐스팅
public class CastingMain3 {
    public static void main(String[] args) {
        // 업 캐스팅 : 자식 타입을 부모 타입으로 변환하는 것
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅
        Parent parent2 = child; // 업캐스팅은 명시적 형변환을 생략할 수 있다.

        parent1.parentMethod();
        parent2.parentMethod();

        // 업캐스팅은 명시적 형변환을 생략할 수 있다. 하지만 다운캐스팅은 생략할 수 없다.
        // 부모는 자식을 담을 수 있지만, 그 반대는 안된다. (꼭 필요하다면 다운캐스팅이 필수이다.)
    }
}
