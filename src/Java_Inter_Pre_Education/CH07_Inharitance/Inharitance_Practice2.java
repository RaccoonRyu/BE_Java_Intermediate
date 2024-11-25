package Java_Inter_Pre_Education.CH07_Inharitance;

// Practice2
// Test Code를 수정하지 않고, 아래와 같이 출력될 수 있도록 오버라이딩 해보기
// 빵빵!
// 위이잉!
// 빵빵!
// 삐뽀삐뽀!

class Car {
    Car() {}
    public void horn() {
        System.out.println("빵빵!");
    }
}

class FireTruck extends Car {
    public void horn() { // Car의 horn() 오버라이딩
        super.horn(); // 부모 클래스의 horn() 호출
        System.out.println("위이잉!");
    }
}

class PoliceCar extends Car {
    public void horn() { // Car의 horn() 오버라이딩
        super.horn(); // 부모 클래스의 horn() 호출
        System.out.println("삐뽀삐뽀!");
    }
}

public class Inharitance_Practice2 {
    public static void main(String[] args) {
        // Test Code
        FireTruck ft = new FireTruck();
        ft.horn();

        PoliceCar pc = new PoliceCar();
        pc.horn();
    }
}
