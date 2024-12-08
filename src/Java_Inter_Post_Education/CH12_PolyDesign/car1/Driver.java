package Java_Inter_Post_Education.CH12_PolyDesign.car1;

// 클라이언트 역할을 하는 코드
// OCP 원칙에 따라 새로운 기능(차량)을 추가하더라도, Driver 코드는 전혀 변경되지 않는다.
// 확장에 열려있음 : Car 인터페이스를 사용해서 새로운 차량(기능)을 자유롭게 추가할 수 있음
// 코드 수정은 닫혀있음 : 새로운 차를 추가하게 되면 기능이 추가되기 때문에 기존 코드의 수정은 불가피하나, 직접 Car를 사용하는 클리이언트인 Driver를 전혀 변경하지 않는다.
// -> 따라서 변하지 않는 부분(닫힌 부분)은 Driver, 변하는 부분은 main()과 같이 새로운 차를 생성하고 Driver에게 전달해주는 코드이다.
// main()은 전체 프로그램을 설정하고 조율하는 역할을 하기 때문에, 해당 부분(main)은 OCP를 지켜도 당연히 변경이 필요하다.
public class Driver {

    // 특정 차량을 가지지 않고 자동차라는 역할만 이해한다.
    private Car car;

    // 외부에서 운전할 자동차를 실제로 설정(인스턴스의 참조값 설정)
    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다 : " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
