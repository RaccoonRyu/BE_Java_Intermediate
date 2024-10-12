package CH09.AbstractClass;

// 추상 클래스 Person
// abstract 키워드를 사용하여 클래스를 작성한다.
abstract class Person {

    // 추상 메서드
    // abstract 키워드를 사용하여 메서드를 작성
    // 해당 클래스를 상속 받은 클래스가 반드시 구현해야 할 부분을 추상 메서드로 작성한다.
    // 이 때 구현 부분({중괄호}) 없이 세미콜론으로 종료
    abstract void printInfo();
}

// 추상 클래스 상속
class Student extends Person {
    // 추상 클래스를 상속 받았기 때문에 추상 클래스 내부의 추상 메서드를 반드시 구현해주어야 함
    public void printInfo() { // 상속받은 추상 클래스 내부의 추상 메서드 오버라이딩
        System.out.println("Student.printInfo");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // 추상 클래스
        //Person p1 = new Person(); // 추상 클래스는 객체로 직접 생성 불가
        // 사용 방법 1 : 추상 클래스를 상속 받은 클래스의 객체 생성
        Student s1 = new Student();
        s1.printInfo();

        // 사용 방법 2 : 추상 클래스를 아래 오버라이딩을 통해 완성(생성). 이를 익명 클래스라고 한다.
        Person p2 = new Person() {
            @Override
            void printInfo() {
                System.out.println("Person.printInfo"); // Person의 추상 메서드 오버라이딩
            }
        }; // 객체 생성한 부분 마지막에 반드시 세미콜론 작성

        p2.printInfo();
    }
}
