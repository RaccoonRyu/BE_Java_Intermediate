package Java_Inter_Post_Education.CH02_PriRef;

public class Method1 {
    public static void main(String[] args) {
        // 메서드에 객체를 전달하는 방식(initStudent)으로 객체 생성 시 중복된 코드를 제거하기
        Student stu1 = new Student();
        initStudent(stu1, "학생1", 15, 90);
        /*stu1.name = "학생1";
        stu1.age = 15;
        stu1.grade = 90;*/

        Student stu2 = new Student();
        initStudent(stu2, "학생2", 16, 80);
        /*stu2.name = "학생2";
        stu2.age = 16;
        stu2.grade = 80;*/

        // 메서드에 객체를 전달하여 출력하는 코드를 한개의 함수(printStudent)로 줄임
        printStudent(stu1);
        printStudent(stu2);
    }

    public static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 성적 : " + student.grade);
    }

    public static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;

    }
}
