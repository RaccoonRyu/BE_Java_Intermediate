package Java_Inter_Post_Education.CH12_PolyDesign.car0;

public class Driver {
    // Driver는 K3자동차, Model3차를 가짐
    private K3Car k3Car;
    private Model3Car model3Car;

    // 외부에서 K3자동차를 설정해주는 메서드(객체 생성X)
    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    // 외부에서 Model3차를 설정해주는 메서드(객체 생성X)
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if(k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if(model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
