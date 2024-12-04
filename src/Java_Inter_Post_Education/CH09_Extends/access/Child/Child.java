package Java_Inter_Post_Education.CH09_Extends.access.Child;

import Java_Inter_Post_Education.CH09_Extends.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        pubVal = 1;
        protVal = 1; // 상속 관계 or 같은 패키지는 protected 사용 가능
        //defVal = 1; // 다른 패키지에서 접근 불가하여 컴파일 오류
        //priVal = 1; // private이기 때문에 접근 불가하여 컴파일 오류

        publicMethod();
        protectedMethod();
        //defaultMethod(); // 호출 불가
        //privateMethod(); // 호출 불가

        // public인 printParent()는 호출 가능
        // printParent() 안의 로직은 전부 수행 가능 (해당 메서드를 호출하면 부모 클래스 안에서 실행되기 때문에 부모것 모두 호출할 수 있다.)
        printParent();
    }
}
