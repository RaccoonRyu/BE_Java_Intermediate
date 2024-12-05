package Java_Inter_Post_Education.CH10_Poly.basic;

// instanceof
public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();

        // 메모리상의 인스턴스를 확인하는 키워드 instanceof
        System.out.println("parent1 호출");
        call(parent1);
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if(parent instanceof Child) {
            System.out.println("Child 인스턴스임!");
            ((Child) parent).childMethod();
        } else {
            System.out.println("Child 인스턴스 아님!");
        }
    }
}
