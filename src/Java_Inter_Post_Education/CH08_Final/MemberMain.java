package Java_Inter_Post_Education.CH08_Final;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("seo");
        member.print();
    }
}
