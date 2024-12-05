package Java_Inter_Post_Education.CH11_PolyAdvance.ex6;

// 클래스를 상속받은 후 추가로 인터페이스를 구현할 수 있다.
// extends를 통한 상속은 하나만 할 수 있고, implements를 통한 인터페이스는 다중 구현할 수 있기 때문에
// 둘이 함께 나온 경우 extends가 먼저 나와야한다.
public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void fly() {
        System.out.println("닭 날기");
    }
}
