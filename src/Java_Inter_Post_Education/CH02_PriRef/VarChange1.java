package Java_Inter_Post_Education.CH02_PriRef;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b); // 둘 다 10

        // a 변경
        a = 20;
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10. a의 값만 변경했기 때문

        // b 변경
        b = 30;
        System.out.println("a = " + a); // 20. b의 값만 변경했기 때문
        System.out.println("b = " + b); // 30
    }
}
