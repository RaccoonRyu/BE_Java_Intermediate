package Java_Inter_Post_Education.CH11_PolyAdvance.ex4;


public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스는 생성 불가
        //AbstractAnimal abstractAnimal = new AbstractAnimal(); // AbstractAnimal는 추상 클래스이므로 인스턴스화할 수 없다. 컴파일 에러

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        animalSound(dog);
        animalSound(cat);
        animalSound(caw);

        animalMove(dog);
        animalMove(cat);
        animalMove(caw);
    }

    private static void animalSound(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void animalMove(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
