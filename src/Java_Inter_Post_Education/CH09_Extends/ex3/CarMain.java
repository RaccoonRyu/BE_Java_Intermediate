package Java_Inter_Post_Education.CH09_Extends.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hyCar = new HydrogenCar();
        hyCar.move();
        hyCar.fillHydro();
        hyCar.openDoor();
    }
}
