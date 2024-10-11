package CH06.ClassInstance;

// Car1 클래스 -  객체 변수, 메서드
class Car1 {
    // 객체 변수
    String name;
    String type;

    // 기본 생성자 존재함(생략 가능) - 클래스 명과 같은 이름
    // Car1() {}

    // 반환값이 없는(void) 메서드
    public void printCarInfo() {
        System.out.println("** Car Info **");
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void move() {
        System.out.println("이동!");
    }

    public void breakCar() {
        System.out.println("정지!");
    }
}

// Car2 클래스 - 생성자, this
class Car2 {
    // 객체 변수
    String name;
    String type;

    // 생성자 커스텀 가능 - 객체 생성 시 이름과 타입을 바로 사용할 수 있도록 파라미터에 작성
    Car2(String name, String type) {
        this.name = name; // 객체 자기 자신을 가리키는 키워드 this. 즉 이 때는 객체 변수 name을 가리키는 것
        this.type = type;
        System.out.println("생성자 호출 수행!");
    }

    // 반환값이 없는(void) 메서드
    public void printCarInfo() {
        System.out.println("** Car Info **");
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void load() {
        System.out.println("짐을 넣으세요.");
    }

    public void horn() {
        System.out.println("경적이 울립니다!");
    }
}

public class ClassInstance1 {
    public static void main(String[] args) {
        // 클래스와 객체 1
        // Car1 클래스 사용
        // 클래스명 객체명 = new 클래스명(); 로 객체 생성
        Car1 myCar1 = new Car1();

        // 객체명을 통한 객체 변수와 메서드에 접근
        myCar1.name = "KONA";
        myCar1.type = "SUV";
        myCar1.printCarInfo();
        myCar1.move();
        myCar1.breakCar();

        // Car2 클래스 사용
        Car2 myCar2 = new Car2("NIRO", "SUV"); // Class 작성 시 생성자에 파라미터를 입력받게끔 작성했으므로, 객체 생성 시 파라미터 추가하여 생성
        myCar2.printCarInfo();
        myCar2.load();
        myCar2.horn();

    }
}
