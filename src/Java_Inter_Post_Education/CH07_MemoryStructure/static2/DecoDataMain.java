package Java_Inter_Post_Education.CH07_MemoryStructure.static2;

import static Java_Inter_Post_Education.CH07_MemoryStructure.static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출 1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출 2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        staticCall(data1);

        // 인스턴스를 통한 접근 - 인스턴스 메서드에 접근하는 것 처럼 보이는 오해의 소지가 있어 해당 접근 방식을 추천하지 않는다. 권장하지 않음
        DecoData data3 = new DecoData();
        staticCall();

        // 클래스를 통한 접근
        staticCall();

        // import static을 통한(3라인) 클래스명 생략 후 여러 번 호출
        staticCall();
        staticCall();

    }
}
