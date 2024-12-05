package Java_Inter_Post_Education.CH11_PolyAdvance.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        // 다형성을 사용하여 부모 타입의 배열을 만들고, 배열의 요소를 자식 타입의 객체로 구성할 수 있다.
        // 이 때 자식 타입의 객체를 새로 생성해서 넣는 것 또한 당연히 가능하다.
        Animal[] animals = {new Dog(), new Cat(), new Caw()};

        // 당연히 배열을 사용하는 향상된 for문 또한 사용할 수 있다.
        for (Animal animal : animals) {
            animalSound(animal); // ctrl alt m 으로 코드블럭을 메서드로 추출했음!
        }
    }

    private static void animalSound(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
