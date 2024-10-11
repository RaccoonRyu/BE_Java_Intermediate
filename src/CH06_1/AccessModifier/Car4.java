package CH06_1.AccessModifier; // 패키지 경로

// 접근 제어자 예제를 위한 Class Car4
public class Car4 {
    public String name1;
    private String name2;
    protected String name3;
    String name4;

    public Car4(String name1, String name2, String name3, String name4) {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
    }
}
