package Java_Inter_Post_Education.CH02_PriRef;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // 중요!! 인스턴스가 복사되는 것이 아니라 dataA의 참조 값만 읽어서 dataB에 대입(전달)

        System.out.println("dataA = " + dataA);
        System.out.println("dataB = " + dataB); // 참조값 동일
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value); // value 10 동일

        // dataA 변경
        dataA.value = 20;
        System.out.println("dataA.value = " + dataA.value); // 20으로 변경
        System.out.println("dataB.value = " + dataB.value); // 20으로 변경

        // dataB 변경
        dataB.value = 30;
        System.out.println("dataA.value = " + dataA.value); // 30으로 변경
        System.out.println("dataB.value = " + dataB.value); // 30으로 변경
    }
}
