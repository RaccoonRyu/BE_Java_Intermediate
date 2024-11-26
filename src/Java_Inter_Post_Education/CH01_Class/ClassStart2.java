package Java_Inter_Post_Education.CH01_Class;

public class ClassStart2 {
    public static void main(String[] args) {
        // 앞서 작성한 학생 클래스 사용

        Student student1;
        student1 = new Student(); // new 키워드 + 클래스명()를 사용하여 학생 클래스의 객체를 실제 메모리에 생성

        // 클래스에서는 . 을 통해 멤버 변수(필드)에 접근
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student(); // new 키워드 + 클래스명()를 사용하여 학생 클래스의 객체를 실제 메모리에 생성 (학생1과 별개의 객체)

        // 클래스에서는 .(점, dot) 을 통해 멤버 변수(필드)에 접근하여 대입 및 사용
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2); // @뒤에 표현되는 16진수 참조값을 확인할 수 있다.

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);

    }
}
