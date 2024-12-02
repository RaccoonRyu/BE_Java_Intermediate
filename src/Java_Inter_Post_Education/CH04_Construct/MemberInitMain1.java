package Java_Inter_Post_Education.CH04_Construct;

public class MemberInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 14;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user1";
        member2.age = 15;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름 : " + member.name + ", 나이 : " + member.age + ", 성적 : " + member.grade);
        }
    }
}
