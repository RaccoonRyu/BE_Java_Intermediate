package CH07.Inharitance;

// Practice1
// Test Code를 수정하지 않고 Cat 클래스 내의 super or super()를 이용하여 고양이 입니다. 가 출력될 수 있도록 변경

class Animal {
    String desc;

    Animal() {
        this.desc = "동물 클래스 입니다.";
    }

    Animal(String desc) {
        this.desc = desc;
    }

    public void printInfo() {
        System.out.println(this.desc);
    }
}

class Cat extends Animal {
    String desc;
    Cat() {
        //this.desc = "고양이 입니다.";
        super("고양이 입니다."); // sol 2 - Cat 객체 생성시 super(String desc)를 이용하여 부모 클래스의 생성자를 호출
        super.desc = "고양이 입니다."; // sol 1 - Cat 객체 생성시 super를 이용하여 부모 클래스의 desc를 변경함
    }
}

public class Inharitance_Practice1 {
    public static void main(String[] args) {
        // Test Code
        Cat cat = new Cat();
        cat.printInfo();
    }
}
