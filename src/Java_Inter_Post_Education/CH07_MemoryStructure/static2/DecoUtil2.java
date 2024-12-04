package Java_Inter_Post_Education.CH07_MemoryStructure.static2;

public class DecoUtil2 {
    // 메서드에 static 붙여서 정적 메서드(클래스 메서드)를 작성
    // 이를 통해 정적 메서드를 만들 수 있고, 정적 메서드는 인스턴스 생성 없이 클래스 명을 통해 바로 호출이 가능하다.
    public static String deco(String str) {
       return "*" + str + "*";
    }
}
