package Java_Inter_Post_Education.CH02_PriRef;

public class Method2 {
    public static void main(String[] args) {
        // 이제는 메서드에 객체를 전달하는 방식이 아니라 메서드를 사용하여 객체를 생성하는 방식으로 코드를 줄인다.
        Student stu1 = createStudent("학생1", 15, 90);
        //initStudent(stu1, "학생1", 15, 90);
        /*stu1.name = "학생1";
        stu1.age = 15;
        stu1.grade = 90;*/

        Student stu2 = createStudent("학생2", 16, 80);
        //initStudent(stu2, "학생2", 16, 80);
        /*stu2.name = "학생2";
        stu2.age = 16;
        stu2.grade = 80;*/

        // 메서드에 객체를 전달하여 출력하는 코드를 한개의 함수(printStudent)로 줄임
        printStudent(stu1);
        printStudent(stu2);
    }

    public static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    public static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 성적 : " + student.grade);
    }
}
