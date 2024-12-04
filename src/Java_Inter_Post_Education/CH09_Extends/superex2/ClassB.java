package Java_Inter_Post_Education.CH09_Extends.superex2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        super(); // 부모의 기본 생성자 호출. 생략 가능
        System.out.println("Class B 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); // 부모의 기본 생성자 호출. 생략 가능
        System.out.println("Class B 생성자 a = " + a);
        System.out.println("Class B 생성자 b = " + b);
    }
}
