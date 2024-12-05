package Java_Inter_Post_Education.CH11_PolyAdvance.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        // 다형성을 사용하여 동물 소리 함수를 실행 가능
        sound(dog);
        sound(cat);
        sound(caw);
    }

    private static void sound(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
