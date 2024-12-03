package Java_Inter_Post_Education.CH06_AccessModifier.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        // public, default 이므로 같은 패키지 내에서 사용 가능
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
