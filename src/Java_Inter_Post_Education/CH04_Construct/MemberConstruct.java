package Java_Inter_Post_Education.CH04_Construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자
    // 클래스명과 동일한 이름의 메서드 작성
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 생성자 오버로딩
    // 생성자 또한 메서드처럼 오버로딩이 가능하다.
    // this() : 생성자 내부에서 인스턴스 자기 자신의 다른 생성자를 호출할 수 있도록 함
    // 사용 규칙 : this()는 생성자 안에서 생성자 코드의 첫 줄에만 작성할 수 있다.
    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }
}
