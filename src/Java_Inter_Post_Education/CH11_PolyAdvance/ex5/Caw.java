package Java_Inter_Post_Education.CH11_PolyAdvance.ex5;

// 인터페이스를 구현(상속)할 때는 implements 키워드를 사용한다.
public class Caw implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }

}