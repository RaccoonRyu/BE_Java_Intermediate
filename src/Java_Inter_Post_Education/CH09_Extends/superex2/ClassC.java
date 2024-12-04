package Java_Inter_Post_Education.CH09_Extends.superex2;

public class ClassC extends ClassB {

    public ClassC() {
        //super(); // 부모(B)가 생성자를 직접 정의했으므로, 부모의 기본 생성자 호출 불가
        super(10); // 따라서 부모에서 직접 정의한 생성자를 호출해야 한다.
        System.out.println("Class C 생성자");
    }
}
