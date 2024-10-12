package CH10.Interface;

// School 인터페이스
interface School {
    public static final int MAX_CLASS = 20;
    public static final int MAX_PERSON_PER_CLASS = 40; // 여기까지 상수(final) 2개
    public abstract void printSchool(); // 추상 메서드
}

// Student 클래스 - School 인터페이스 이용
class Student implements School {
    public void printSchool() {
        System.out.println("CAU");
    }
}

// Person 클래스
class Person {
    public String name;

    public void printName() {
        System.out.println("name = " + name);
    }
}

// Student2 클래스 - Person 상속 + School 인터페이스 이용 (다중 상속처럼 사용)
// 순서 : 클래스 클래스명 extends 상속클래스명 implements 인터페이스명 (상속 먼저 인터페이스 다음)
class Student2 extends Person implements School {

    Student2(String name) {
        super.name = name; // name 값을 받아 Person의 name 변수에 저장
    }

    public void printSchool() {
        System.out.println("YNU");
    }
}

public class Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 상속과 인터페이스를 동시 사용함으로서 다중 상속처럼 사용할 수 있음
        // 추상 메서드와 상수(final : 데이터의 값 변경이 불가능한 변수)만으로 이루어짐

        // 1. 인터페이스 기본 사용
        System.out.println("** 기본 인터페이스 **");
        Student s1 = new Student();
        s1.printSchool(); // 인터페이스의 추상 메서드를 오버라이딩 한 메서드
        System.out.println(s1.MAX_CLASS);
        System.out.println(s1.MAX_PERSON_PER_CLASS); // 인터페이스의 상수들을 정상적으로 출력함을 확인

        // 2. 다중 상속처럼 사용하기
        System.out.println("** 다중 상속처럼 사용 **");
        Student2 s2 = new Student2("JM");
        s2.printSchool(); // 인터페이스의 추상 메서드 오버라이딩
        s2.printName();
    }
}
