package Java_Inter_Post_Education.CH01_Class;

public class ClassStart0 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        // 학생이 늘어날 때 마다 변수를 추가로 선언하고 출력하는 코드를 추가해야하는 문제가 있다. -> 배열로 해결이 가능할까?

        System.out.println("이름 : " + student1Name + " 나이 : " + student1Age + " 성적 : " + student1Grade);
        System.out.println("이름 : " + student2Name + " 나이 : " + student2Age + " 성적 : " + student2Grade);
    }
}
