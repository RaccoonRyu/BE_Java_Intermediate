package Java_Inter_Post_Education.CH07_MemoryStructure.static1;

public class Data3 {
    public String name;
    public static int count; // static 키워드 사용하여 해당 클래스의 여러 인스턴스들이 공용으로 함께 사용할 수 있는 변수 선언

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
