package Java_Inter_Post_Education.CH04_Construct;

public class MemberThis {
    String nameField;

    // 매개변수와 멤버변수 이름이 다르면 this를 생략할 수 있다.
    void initMember(String nameParam) {
        nameField = nameParam;
    }
}
