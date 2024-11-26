package Java_Inter_Post_Education.CH01_Class;

public class ClassStart3 {
    public static void main(String[] args) {
        // 앞서 작성한 학생 클래스 사용

        Student student1 = new Student(); // new 키워드 + 클래스명()를 사용하여 학생 클래스의 객체를 실제 메모리에 생성

        // 클래스에서는 . 을 통해 멤버 변수(필드)에 접근
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // new 키워드 + 클래스명()를 사용하여 학생 클래스의 객체를 실제 메모리에 생성 (학생1과 별개의 객체)

        // 클래스에서는 .(점, dot) 을 통해 멤버 변수(필드)에 접근하여 대입 및 사용
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // Student 타입의 변수들을 담은 배열을 만들어 출력 등 사용에 용이하게 변경한다!
        // 이 때 Student 타입의 변수는 Student 인스턴스의 참조값을 보관한다.
        // 따라서 Student 배열의 각 항목도 Student 인스턴스의 참조값을 보관한다.
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        // 배열에 들어있는 객체를 사용하려면 먼저 배열에 접근(배열의 주소)하고 그 다음에 객체에 접근(객체의 주소)하면 된다.
        System.out.println("이름 : " + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].grade);

    }
}
