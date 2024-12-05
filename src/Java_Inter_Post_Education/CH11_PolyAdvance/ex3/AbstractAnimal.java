package Java_Inter_Post_Education.CH11_PolyAdvance.ex3;

// 추상 클래스
// 클래스가 추상 메서드를 하나라도 가지면 추상 클래스로 선언해야 한다.
public abstract class AbstractAnimal {

    // 추상 메서드
    // 추후 해당 클래스를 상속받을 자식 클래스가 해당 메서드를 반드시 오버라이딩 해야한다.
    public abstract void sound();

    // 물론 추상 클래스에서도 일반 메서드를 작성할 수 있다.
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
