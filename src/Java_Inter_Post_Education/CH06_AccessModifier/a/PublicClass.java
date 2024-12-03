package Java_Inter_Post_Education.CH06_AccessModifier.a;

public class PublicClass {
    public static void main(String[] args) {
        // 클래스 자기 자신의 객체 생성
        PublicClass publicClass = new PublicClass();

        // default 클래스 객체 생성
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
