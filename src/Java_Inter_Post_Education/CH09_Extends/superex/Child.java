package Java_Inter_Post_Education.CH09_Extends.superex;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); // this 생략 가능 (this : 자기 자신의 참조)
        // super : 부모 클래스의 멤버에 접근하기 위한 키워드. 부모 클래스에 대한 참조
        System.out.println("super value = " + super.value);

        this.hello(); // this 생략 가능
        super.hello();
    }
}
