package CH11.InnerClass;

// 내부 클래스 구조
class Outer {
    public void print() {
        System.out.println("Outer.print");
    }

    // 내부 - 인스턴스 클래스
    class Inner {
        public void innerPrint() {
            Outer.this.print(); // 내부 클래스에서는 외부 클래스에 접근 가능
        }
    }

    // 내부 - 정적 클래스
    static class InnerStatic {
        public void innerPrint() {
            //Outer.this.print(); // Outer는 static으로 작성하지 않았으므로 메모리에 할당되지 않아 바로 사용 불가
            System.out.println("Static.print");
        }
    }
}

abstract class Person {
    public abstract void printInfo();
}

class Student extends Person {
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}

public class InnerClass {
    public static void main(String[] args) {
        // 내부 클래스 (중첩 클래스)
        // 클래스 안에 선언한 클래스
        // 내부 클래스에서는 외부 클래스(안-밖) 멤버에 접근 가능 - 외부에서는 내부 클래스(밖-안)에 접근 불가
        // 내부 클래스 종류 : 인스턴스, 정적, 지역, 익명

        // 익명 클래스
        // 이름을 가지지 않는 클래스
        // 선언과 동시에 객체 생성. 일회용 클래스

        // 외부 클래스
        Outer o1 = new Outer();

        // 내부 클래스 - 인스턴스 클래스인 경우
        // 외부 클래스 객체를 먼저 만든 후 내부 클래스 객체를 만들어서 접근
        Outer.Inner i1 = new Outer().new Inner();

        // 내부 클래스 - 정적 클래스인 경우
        // 정적 클래스 객체 생성은 static이기 때문에 외부 클래스 객체를 생성할 필요 없이 바로 생성
        Outer.InnerStatic is1 = new Outer.InnerStatic();

        // 익명 클래스
        // 추상 클래스를 통해 익명 클래스 구현
        // Person이라는 클래스를 받아서 익명 클래스를 구현
        Person p1 = new Person() {
            @Override
            public void printInfo() {
                System.out.println("Person.printInfo");
            }
        };

    }
}
