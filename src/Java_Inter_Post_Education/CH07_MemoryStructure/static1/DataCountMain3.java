package Java_Inter_Post_Education.CH07_MemoryStructure.static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        // static을 사용한 정적 변수는 클래스명에 .(dot)을 사용하여 접근한다. 클래스에 직접 접근하는 것 처럼 느껴진다.
        System.out.println("A count : " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count : " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count : " + Data3.count);

        // 물론 정적 변수는 인스턴스를 통해서도 접근할 수 있다.
        // 물론 count가 인스턴스 변수가 아니기 때문에, 인스턴스 변수에 접근하는 것 처럼 보이는 오해의 소지가 있어 해당 접근 방식을 추천하지 않는다.
        Data3 data4 = new Data3("D");
        System.out.println("D count : " + data4.count); // 4 출력 됨
    }
}
