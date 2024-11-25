package Java_Inter_Pre_Education.CH06_ClassInstance;

// 클래스와 객체 1 연습문제

class Animal {
    String name;
    Double weight;
    String type;

    Animal(String name, Double weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public void printInfo() {
        System.out.println("name = " + name);
        System.out.println("weight = " + weight);
        System.out.println("type = " + type);
    }

    public void eat() {
        System.out.println("먹기!");
    }

    public void sleep() {
        System.out.println("자기!");
    }

    public void walk() {
        System.out.println("걷기!");
    }

    public void run() {
        System.out.println("뛰기!");
    }
}

public class ClassInstance1_Practice {
    public static void main(String[] args) {
        Animal animal1 = new Animal("강아지", 5.0, "포유류");
        Animal animal2 = new Animal("구피", 0.01, "어류");

        animal1.printInfo();
        animal2.printInfo();
    }
}
