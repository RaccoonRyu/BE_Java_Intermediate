package CH08.Polymorphism;

// Practice
// 아래 클래스와 상속 관계에서 다형성을 이용하여 Car 객체를 통해 아래와 같이 출력될 수 있도록 Test Code 부분 구현
// 빵빵!
// 위이잉!
// 삐뽀삐뽀!

class Car {
    Car() {}
    public void horn() {
        System.out.println("빵빵!");
    }
}

class FireTruck extends Car {
    public void horn() {
        System.out.println("위이잉!");
    }
}

class Ambulance extends Car {
    public void horn() {
        System.out.println("삐뽀삐뽀!");
    }
}

public class Polymoriphism_Practice {
    public static void main(String[] args) {
        // Test Code - sol 1
        Car c1 = new Car();
        c1.horn();
        c1 = new FireTruck();
        c1.horn();
        c1 = new Ambulance();
        c1.horn();

        // sol 2
        // 다형성을 이용하면 부모 클래스 타입 하나로 자식 클래스 객체들을 모두 가리킬 수 있다.
        // 각 객체들이 원소인 배열을 만들어서 for문으로 순회하며 출력 가능
        Car car[] = {new Car(), new FireTruck(), new Ambulance()};

        for (Car item: car) {
            item.horn();
        }
    }
}
