package CH07.Inharitance;

class Person {
    String name;
    int age;
    public int a1;
    private int a2;

    Person() {}

    Person(String name, int age) { // 오버로딩 생성자
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Person.printInfo");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}

// Student 클래스 - Person 상속, 접근 제어자 확인
class Student extends Person {
    Student() {
        a1 = 1;
        //a2 = 1; // 접근 제어자가 private이기 때문에 상속을 받았음에도 다른 class에서 해당 변수 접근할 수 없음
    }
}

// Student2 클래스 - Person 상속, super 사용, 오버라이딩
class Student2 extends Person {
    String name;
    int stdId;

    // super 사용
    Student2(String name, int age, int stdId) {
        super(name, age); // super()는 부모 클래스의 생성자를 호출(11~14라인)
        super.name = name; // super는 부모 클래스인 Person의 멤버 변수 name을 가리킴
        this.name = name; // this는 Student2의 멤버 변수 name을 가리킴
        this.age = age; // this는 Student2에 멤버 변수 age가 없으므로 Person에서 상속받은 age를 가리킴
        this.stdId = stdId; // this는 Student2의 멤버 변수 stdId를 가리킴
    }

    // 오버라이딩

    @Override
    public void printInfo() {
        System.out.println("Student2.printInfo");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("stdId = " + stdId);
    }
}

public class Inharitance {
    public static void main(String[] args) {
        // 1. 상속
        // class 자식클래스명 extends 부모클래스명 {} 으로 상속

        System.out.println("*** 상속 ***");
        Student s1 = new Student();
        s1.name = "RYU";
        s1.age = 31;
        s1.printInfo(); // Student 안에 아무 내용도 없지만 Person을 상속받기 때문에 Person의 자원을 사용할 수 있음

        // 2. super, super(), 오버라이딩
        // super : 부모 클래스와 자식 클래스의 멤버명이 같을 때 부모 클래스의 멤버를 가리키는 키워드
        // super() : 부모 클래스의 생성자 호출
        System.out.println("** super, super(), 오버라이딩 **");
        Student2 s2 = new Student2("Heon", 31, 1);
        s2.printInfo();
    }
}
