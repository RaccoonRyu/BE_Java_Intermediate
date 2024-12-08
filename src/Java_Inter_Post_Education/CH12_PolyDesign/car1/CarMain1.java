package Java_Inter_Post_Education.CH12_PolyDesign.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택 - k3
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive(); // K3에서 오버라이딩한 메서드 실행됨!

        // 차량 변경 - model3
        Model3car model3car = new Model3car();
        driver.setCar(model3car);
        driver.drive(); // model3에서 오버라이딩한 메서드 실행됨!

        // 차량 변경 - NewCar
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive(); // NewCar에서 오버라이딩한 메서드 실행됨!
    }
}
