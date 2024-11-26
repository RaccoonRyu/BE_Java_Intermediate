package Java_Inter_Post_Education.CH02_PriRef;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NPE 발생!!! 아래 로직은 수행되지 않음
        System.out.println("data.value = " + data.value);

    }
}
