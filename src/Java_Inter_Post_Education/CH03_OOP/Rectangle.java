package Java_Inter_Post_Education.CH03_OOP;

public class Rectangle {
    int width;
    int height;
    int area;

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }
}
