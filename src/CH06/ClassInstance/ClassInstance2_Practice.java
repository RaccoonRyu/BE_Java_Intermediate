package CH06.ClassInstance;

// 클래스와 객체 2 연습문제
class Calculator {

    public int sum(int a, int b) {return a + b;}

    public double sum(double a, double b) {return a + b;}

    public double sum(String a, String b) {return Double.parseDouble(a) + Double.parseDouble(b);} // Double.parseDouble : String을 Double로 형변환

    public int sum(int a, int b, int c) {return a + b + c;}

}

public class ClassInstance2_Practice {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1, 2));
        System.out.println(cal.sum(1.0, 2.0));
        System.out.println(cal.sum("1", "2"));
        System.out.println(cal.sum(1, 2, 3));
    }
}
