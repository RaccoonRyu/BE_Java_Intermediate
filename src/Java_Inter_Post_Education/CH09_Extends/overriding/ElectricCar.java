package Java_Inter_Post_Education.CH09_Extends.overriding;

// 부모 클래스 Car를 상속 받기 위해 extends 키워드 사용
public class ElectricCar extends Car {

    public void charge() {
        System.out.println("차를 충전합니다.");
    }

    // 메서드 오버라이딩 : 자식이 부모의 기능(메서드)을 재정의(오버라이딩) 하는 것
    // 애노테이션 : @가 붙으면 프로그램이 읽을 수 있는 특별한 주석이 된다. 추후 설명!
    // @Override : 상위 클래스의 메서드를 오버라이드하는 것임을 나타내는 애노테이션. 오버라이딩이 정확히 되지 않으면 컴파일 오류를 낸다.
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}
