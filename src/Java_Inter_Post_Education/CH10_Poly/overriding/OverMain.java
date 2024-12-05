package Java_Inter_Post_Education.CH10_Poly.overriding;

public class OverMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("child.value = " + child.value);
        child.method();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("parent.value = " + parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("poly.value = " + poly.value);
        poly.method(); // 메서드 오버라이딩 되어 child의 메서드가 출력됨을 확인
        // 인스턴스 안에서 오버라이딩 된 메서드는 항상 우선권을 가지기 때문!!
    }
}
