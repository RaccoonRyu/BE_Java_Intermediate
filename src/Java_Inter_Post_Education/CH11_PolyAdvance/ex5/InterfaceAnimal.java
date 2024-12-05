package Java_Inter_Post_Education.CH11_PolyAdvance.ex5;

public interface InterfaceAnimal {
    public abstract void sound();
    void move(); // 인터페이스에서는 public abstract 키워드 생략 가능

    // 인터페이스는 여러군데에서 사용하는 목적으로 만들어지기 때문에 접근제어자 또한 public으로 쓴다.
}
