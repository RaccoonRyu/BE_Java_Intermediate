package Java_Inter_Post_Education.CH11_PolyAdvance.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        animalSound(dog);
        animalSound(bird);
        animalSound(chicken);

        flyAnlmal(bird);
        flyAnlmal(chicken);
    }

    // AbstractAnimal를 통해 사용 가능한 메서드
    private static void animalSound(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    // Fly를 통해 사용 가능한 메서드
    // Fly를 구현한 모든 클래스에서 사용 가능한 메서드
    private static void flyAnlmal(Fly fly) {
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
}
