package Java_Inter_Post_Education.CH02_PriRef;

public class MethodChange1 {
    public static void main(String[] args) {
        // 기본형과 메서드 호출
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a); // 10
        changePrimitive(a);
        System.out.println("메서드 호출 후 : a = " + a); // 10
    }

    private static void changePrimitive(int a) {
        a = 20;
    }
}
