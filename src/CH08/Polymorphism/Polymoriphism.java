package CH08.Polymorphism;

class Person {
    public void print() {
        System.out.println("Person.print");
    }
}

class Student extends Person {
    public void print() {
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person {
    public void print() {
        System.out.println("CollegeStudent.print");
    }
}

public class Polymoriphism {
    public static void main(String[] args) {
        // 1. 다형성
        System.out.println("** 다형성 **");
        Person p1 = new Person();
        Student s1 = new Student();

        Person p2 = new Student(); // 다형성 : 자식 클래스의 객체를 부모 클래스의 참조 변수로 참조
        //Student s2 = new Person(); // 부모 클래스의 객체를 자식 클래스의 참조 변수로 참조하는 것은 불가.

        p1.print();
        s1.print();
        s1.print2();
        p2.print(); // p2가 참조하는 대상은 자식 클래스 객체(Student) 이므로 Student의 print()가 호출됨
        //p2.print2(); // 하지만 Person 객체에서 오버라이딩 된 함수까지만 접근 가능하므로 print2()는 호출 불가. Person 타입에 맞게끔 접근할 수 있는 부분까지만 접근 가능하다.

        Person p3 = new CollegeStudent();
        //CollegeStudent c1 = new Student(); // 같은 부모를 상속받았다 하더라도 자식 클래스 끼리는 다형성 사용 불가
        p3.print();

        // 2. 타입 변환
        System.out.println("** 타입 변환 **");
        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); // 업 캐스팅 (자식 클래스의 객체가 부모 클래스의 타입으로 형 변환)

        pp1 = pp2;
        pp1 = ss2;
        ss1 = ss2;
        //ss1 = pp2; // 부모 클래스의 객체를 자식 클래스의 참조 변수로 참조하는 것은 불가.
        ss1 = (Student) pp3; // pp3이 Person 타입의 참조 변수지만 Student 객체를 참조하고 있으므로(업 캐스팅) 실제 객체는 Student임. 따라서 Student로 형 변환 하면 에러 없다.
        // 이를 다운 캐스팅 (자기 객체가 부모 클래스의 타입으로 업 캐스팅 되었던 것을 다시 자기 클래스 타입으로 형 변환) 이라고 함.

        CollegeStudent cc1;
        CollegeStudent cc2 = new CollegeStudent();
        // 같은 부모 클래스를 상속 받아도 자식 클래스 끼리는 형변환 되지 않음
        //ss1 = (Student) cc2;
        //cc1 = (CollegeStudent) ss2;

        // 3. instanceof - 해당 객체의 인스턴스를 확인하는 함수
        System.out.println("** instanceof **");
        Person pe1 = new Person();
        Student st1 = new Student();
        // 다형성 2개
        Person pe2 = new Student();
        Person pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person); // true 출력
        System.out.println(pe1 instanceof Student); // false 출력

        // 아래부터는 전부 true
        System.out.println(st1 instanceof Person); // Person 부모 클래스를 상속받아 class를 만들었으므로 true 출력. 다형성 사용 여부를 판별할 수 있음
        System.out.println(st1 instanceof Student);

        System.out.println(pe2 instanceof Person); // Person 부모 클래스를 상속받아 class를 만들었으므로 true 출력. 다형성 사용 여부를 판별할 수 있음
        System.out.println(pe2 instanceof Student);

        System.out.println(pe3 instanceof Person); // Person 부모 클래스를 상속받아 class를 만들었으므로 true 출력. 다형성 사용 여부를 판별할 수 있음
        System.out.println(pe3 instanceof CollegeStudent);

        // instanceof를 통한 다형성 사용 여부 검사 후 형변환이 가능
        if(pe1 instanceof Student) {
            Student stu1 = (Student) pe1;
        }

        if(st1 instanceof Person) {
            Person per1 = (Person) st1;
        }
    }
}
