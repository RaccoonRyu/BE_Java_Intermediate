package Java_Inter_Post_Education.CH12_PolyDesign.car1;

public class Model3car implements Car{
    @Override
    public void startEngine() {
        System.out.println("Model3car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Model3car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3car.pressAccelerator");
    }
}
