package Java_Inter_Post_Education.CH11_PolyAdvance.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        // 다형성을 사용하여 부모 타입의 배열을 만들고, 배열의 요소를 자식 타입의 객체로 구성할 수 있다.
        Animal[] animals = {dog, cat, caw};

        // 당연히 배열을 사용하는 향상된 for문 또한 사용할 수 있다.
        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }


}
