package Java_Inter_Post_Education.CH07_MemoryStructure.static2;

public class DecoData {
    private int instanceVal;
    private static int staticVal;

    public static void staticCall() {
        staticVal++; // 정적 변수 접근 (가능)
        staticMethod(); // 정적 메서드 접근 (가능)

        // static 메서드는 클래스 소속이므로, 인스턴스를 생성해야 사용할 수 있는 인스턴스 변수/메서드에 접근할 수 없다.
        //instanceVal++; // 인스턴스 변수 접근 (불가)
        //instanceMethod(); // 인스턴스 메서드 접근 (불가) -> 둘 다 컴파일 에러
    }

    private void instanceMethod() {
        System.out.println("instanceVal = " + instanceVal);
    }

    private static void staticMethod() {
        System.out.println("staticVal = " + staticVal);
    }

    public void instanceCall() {
        // 인스턴스 메서드에서는 static, 인스턴스 변수/메서드 모두 접근 가능
        instanceVal++; // 인스턴스 변수 접근 (가능)
        instanceMethod(); // 인스턴스 메서드 접근 (가능)

        staticVal++; // 정적 변수 접근 (가능)
        staticMethod(); // 정적 메서드 접근 (가능)
    }

    public static void staticCall(DecoData data) {
        data.instanceVal++;
        data.instanceCall();
    }
}
