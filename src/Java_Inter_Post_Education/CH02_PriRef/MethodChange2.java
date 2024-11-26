package Java_Inter_Post_Education.CH02_PriRef;

public class MethodChange2 {
    public static void main(String[] args) {
        // 참조형과 메서드 호출
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value); // 10
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value); // 20
    }

    private static void changeReference(Data dataA) {
        dataA.value = 20;
    }
}
