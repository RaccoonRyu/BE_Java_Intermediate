package Java_Inter_Post_Education.CH04_Construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // initMember 추가
    // this : 인스턴스 자신의 참조값을 가리키는 키워드
    // this 키워드를 사용하여 현재 클래스의 인스턴스를 가리키도록 한다.
    // 주로 멤버 변수와 메서드의 매개변수 이름이 같을 때 구분하기 위해 사용한다.
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
