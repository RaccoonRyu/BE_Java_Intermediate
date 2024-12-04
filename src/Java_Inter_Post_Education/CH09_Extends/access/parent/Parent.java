package Java_Inter_Post_Education.CH09_Extends.access.parent;

public class Parent {

    public int pubVal;
    protected int protVal;
    int defVal;
    private int priVal;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printParent() {
        System.out.println("== Parent 메서드 안 ==");
        System.out.println("pubVal = " + pubVal);
        System.out.println("protVal = " + protVal);
        System.out.println("defVal = " + defVal);
        System.out.println("priVal = " + priVal);

        // 부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }
}
