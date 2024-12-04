package Java_Inter_Post_Education.CH08_Final;

public class Member {
    // final을 실제 회원가입에서 사용하는 예시(id 변경 불가하도록)
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void print() {
        System.out.println("id : " + id + ", name : " + name);
    }

    public void changeData(String name) {
        this.name = name;
        //this.id = id; // id는 final이므로 변경 불가
    }
}
