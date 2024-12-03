package Java_Inter_Post_Education.CH06_AccessModifier.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        // public 호출 가능
        accessData.pubilcField = 1;
        accessData.publicMethod();

        // 같은 패키지 (default) 호출 가능
        accessData.defaultField = 2;
        accessData.defaultMethod();

        // private은 호출 불가
        //accessData.privateField = 3;
        //accessData.privateMethod(); // 필드, 메서드 둘 다 private으로 선언되어 접근할 수 없다.

        // public 이므로 innerAccess() 호출 가능
        accessData.innerAccess();
    }
}
