package Java_Inter_Post_Education.CH08_Final;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FiledInit filedInit1 = new FiledInit();
        FiledInit filedInit2 = new FiledInit();
        FiledInit filedInit3 = new FiledInit();
        System.out.println(filedInit1.value);
        System.out.println(filedInit2.value);
        System.out.println(filedInit3.value);

        // 상수 접근
        System.out.println("상수");
        System.out.println(FiledInit.CONST_VALUE);
    }
}
