package Java_Inter_Post_Education.CH10_Poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 타입 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 타입 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod(); // 부모, 자신의 메서드 모두 호출 가능

        // 부모 타입 변수가 자식 인스턴스 참조 가능(다형적 참조) -> 부모 타입은 자식 타입을 담을 수 있다.(반대는 불가)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // Child child1 = new Parent(); -> 자식은 부모를 담을 수 없다. 컴파일 에러
        //poly.childMethod(); // 자식 인스턴스를 생성했지만, poly의 호출 타입은 parent이므로 childMethod()를 호출할 수 없다. (자식의 기능 호출할 수 없음)

        // 다형적 참조 : Java에서 부모 타입은 자신은 물론, 자신을 기준으로 만든 모든 자식(자손) 타입을 참조할 수 있다.
        // 이것이 바로 다양한 형태를 참조할 수 있다 하여 다형적 참조라 한다.
        // * 한계 : 상속 관계는 자식 -> 부모 방향으로 찾아 올라갈 수 있지만 부모 -> 자식 방향으로 내려갈 수 없다. 따라서 자식의 기능을 사용하려면 캐스팅이 필요하다.
    }
}
