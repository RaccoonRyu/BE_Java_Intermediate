package Java_Inter_Post_Education.CH11_PolyAdvance.ex5;


public class InterfaceMain {
    public static void main(String[] args) {
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); // 인터페이스는 생성 불가
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        animalSound(cat);
        animalSound(dog);
        animalSound(caw);
    }

    private static void animalSound(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
