package Java_Inter_Post_Education.CH08_Final;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 참조형을 final로 선언
        //data = new Data(); // final로 이미 참조값을 한번 담았기 때문에 새 Data를 담을 수 없다. 컴파일 에러 (참조 대상 변경 불가)

        // 참조 대상의 값은 변경 가능하다.
        // Data의 value는 final이 아니기 때문에!
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

        // 즉 참조형 변수에 final이 붙으면 참조 대상 자체를 다른 대상으로 변경하지 못할 뿐, 참조하는 대상 안의 값은 변경할 수 있다.
    }
}
