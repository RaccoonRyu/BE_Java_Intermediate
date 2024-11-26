package Java_Inter_Post_Education.CH02_PriRef;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("data.value1 = " + data.value1); // 초기화 하지 않았지만 클래스의 멤버 변수이므로 자동 초기화. 0 출력
        System.out.println("data.value2 = " + data.value2); // 초기화한 10 출력
    }
}
