package Java_Inter_Post_Education.CH08_Final;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // final은 최초 한번만 값을 할당할 수 있다.
        //data1 = 20;// 이후 값 할당은 컴파일 오류

        final int data2 = 10; // 변수 선언과 동시에 초기화도 가능하다.
    }

    static void method(final int parameter) {
        // 파라미터를 final로 받으면(매개변수에 final이 붙으면) 파라미터로 들어온 값을 변경할 수 없음.
        //parameter = 10; // 컴파일 오류
    }
}
