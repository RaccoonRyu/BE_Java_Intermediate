package Java_Inter_Post_Education.CH08_Final;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 : " + Constant.MAX_USERS);
        int currentUsers = 999;
        process(currentUsers++);
        process(currentUsers++);
        process(currentUsers++);
    }

    private static void process(int curUserCnt) {
        System.out.println("참여자 수 : " + curUserCnt);
        if(curUserCnt > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
