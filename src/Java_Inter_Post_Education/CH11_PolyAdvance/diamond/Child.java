package Java_Inter_Post_Education.CH11_PolyAdvance.diamond;

// 인터페이스는 상속과 달리 다중 구현 가능!
public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    // methodCommon()의 경우 양쪽 인터페이스에 다 있지만 같은 메서드이므로 구현은 하나만 하면 된다
    // 특정 인터페이스의 methodCommon를 선택하는게 아니라 인터페이스를 구현하는 클래스가 해당 메서드의 주체가 된다.
    // -> 어차피 인터페이스를 구현하는 클래스에서 오버라이딩 된 메서드가 최 우선순위로 호출되기 때문!
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
