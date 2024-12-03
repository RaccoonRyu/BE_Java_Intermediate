package Java_Inter_Post_Education.CH06_AccessModifier.a;

public class AccessData {
    public int pubilcField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + pubilcField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }

    // 내부 호출은 자기 자신에게 접근하는 것이기 때문에 private을 포함한 모든 곳에 접근할 수 있음
    public void innerAccess() {
        System.out.println("내부 호출");
        pubilcField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
