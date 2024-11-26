package Java_Inter_Post_Education.CH02_PriRef;

public class NullMain1 {
    public static void main(String[] args) {
        // null : 참조형 변수가 아직 가리키는 대상이 없거나, 가리키는 대상을 나중에 입력하는 경우, 참조할 주소(참조 값)가 존재하지 않음을 의미
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);

    }
}
