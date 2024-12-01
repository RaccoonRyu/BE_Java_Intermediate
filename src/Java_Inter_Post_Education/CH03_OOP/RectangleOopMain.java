package Java_Inter_Post_Education.CH03_OOP;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.width = 5;
        rect.height = 8;

        System.out.println("넓이 : " + rect.calculateArea());
        System.out.println("둘레 길이 : " + rect.calculatePerimeter());
        System.out.println("정사각형 여부 : " + rect.isSquare());
    }
}
