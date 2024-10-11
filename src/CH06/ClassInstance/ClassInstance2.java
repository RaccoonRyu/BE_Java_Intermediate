package CH06.ClassInstance;

import CH06_1.AccessModifier.Car4;

class Car3 {

    static String name = "None"; // static 변수 - 객체끼리 해당 변수의 값을 공유함
    String type;

    Car3(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo() {
        System.out.println("*** Car Info ***");
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    // 오버로딩 구현 (파라미터로 연도, 차번호, 연도/차번호 같이 받기)
    public void printCarInfo(String date) {
        this.printCarInfo();
        System.out.println("date = " + date);
    }

    public void printCarInfo(int number) {
        this.printCarInfo();
        System.out.println("number = " + number);
    }

    public void printCarInfo(String date, int number) {
        this.printCarInfo();
        System.out.println("date = " + date);
        System.out.println("number = " + number);
    }

    // 스태틱 메서드
    public static void getName() {
        System.out.println("Car name : " + name); // 스태틱 메서드에서 사용하려는 변수 또한 스태틱으로 선언되어야 함
    }
}

public class ClassInstance2 {
    public static void main(String[] args) {
        // 클래스와 객체 2
        Car3 myCar1 = new Car3("KONA", "SUV");

        // 1. 오버로딩 사용
        System.out.println("** 오버로딩 사용 **");
        myCar1.printCarInfo();
        myCar1.printCarInfo("2022");
        myCar1.printCarInfo(1234);
        myCar1.printCarInfo("2022", 1234);

        // 2. 접근 제어자
        System.out.println("** 접근 제어자 **");
        Car4 myCar2 = new Car4("KONA", "NIRO", "NEXO", "VENUE"); // 다른 패키지의 클래스를 사용하기 위해 import 필요
        System.out.println(myCar2.name1); // 접근 가능한 public이므로 화면에 정상 출력됨
/*      System.out.println(myCar2.name2);
        System.out.println(myCar2.name3);
        System.out.println(myCar2.name4);*/

        // 3. static
        System.out.println("** Static **");
        Car3.getName(); // static 메서드는 객체를 생성하지 않아도 클래스 명을 통해 메서드를 호출 가능
        Car3 myCar3 = new Car3("NIRO", "SUV");
        Car3 myCar4 = new Car3("NEXO", "SUV");
        Car3 myCar5 = new Car3("VENUE", "SUV");
        myCar3.printCarInfo();
        myCar4.printCarInfo();
        myCar5.printCarInfo(); // name이 static 변수이기 때문에 모든 객체에서 마지막으로 설정된 name값(VENUE)이 출력됨
    }
}
