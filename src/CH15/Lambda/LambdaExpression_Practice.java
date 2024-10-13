package CH15.Lambda;

// Practice
// 아래 인터페이스를 이용하여 익명 클래스로 구현한 내용을 람다식으로 구현

interface CompareTool {
    public abstract int getMaxNum(int num1, int num2);
}

public class LambdaExpression_Practice {
    public static void main(String[] args) {
        // Test Code
        CompareTool cTool = new CompareTool() {
            @Override
            public int getMaxNum(int num1, int num2) {
                return (num1 > num2) ? num1 : num2;
            }
        };
        System.out.println(cTool.getMaxNum(10, 11)); // 11 출력

        // Lambda
        CompareTool cTool2 = (x, y) -> { return (x > y) ? x : y; };
        System.out.println(cTool2.getMaxNum(10, 11)); // 11 출력
    }
}
