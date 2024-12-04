package Java_Inter_Post_Education.CH07_MemoryStructure;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");

        // 이를 실행하면 main - m1 - m2 순으로 실행되고, m2 - m1 - main 순으로 종료됨을 알 수 있다.
        // 후입 선출이므로, stack 자료구조다.
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 start");
    }
}
