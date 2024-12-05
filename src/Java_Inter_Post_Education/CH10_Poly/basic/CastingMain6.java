package Java_Inter_Post_Education.CH10_Poly.basic;

// JAVA 16의 Pattern Matching for instanceof
// instanceof를 사용하면서 동시에 변수를 선언할 수 있음. -> 인스턴스가 맞는 경우 직접 다운캐스팅 하는 코드를 생략할 수 있다.
public class CastingMain6 {
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
        // Child 인스턴스인 경우 childMethod() 실행
        if(parent instanceof Child child) {
            System.out.println("Child 인스턴스임!");
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님!");
        }
    }
}
