package Java_Inter_Post_Education.CH12_PolyDesign.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        // k3자동차 생성 후 드라이버에 셋팅(운전자가 실제 차를 가지게 되는 시점)
        driver.setK3Car(k3Car);
        driver.drive();

        // k3를 모델3로 변경
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); // 기존 k3Car 참조 제거(차 바꿔타기위해 내림!)
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
