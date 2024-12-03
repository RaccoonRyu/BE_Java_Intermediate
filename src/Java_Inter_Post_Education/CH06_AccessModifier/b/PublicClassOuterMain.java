package Java_Inter_Post_Education.CH06_AccessModifier.b;

import Java_Inter_Post_Education.CH06_AccessModifier.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        // public이므로 다른 패키지에서도 사용할 수 있음
        PublicClass publicClass = new PublicClass();

        // default이므로 다른 패키지에서는 접근 불가
        // DefaultClass1 class1 = new DefalutClass1(); // a 패키지에서 default로 선언되었기 때문에 b 패키지에서 접근 불가
    }
}
