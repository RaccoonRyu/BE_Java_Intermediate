package Java_Inter_Post_Education.CH04_Construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 생성자를 사용하여 객체 생성
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
        
        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름 : " + member.name + ", 나이 : " + member.age + ", 성적 : " + member.grade);
        }
    }
}
