package CH15.Lambda;

interface ComputerTool {
    public abstract int compute(int x, int y);
    //public abstract int compute2(int x, int y); // 단, 람다식 같은 경우에는 인터페이스 안에 추상 메서드가 두개 이상인 경우 사용이 제한된다. (익명 클래스는 정상 사용 가능)
}

public class LambdaExpression {
    public static void main(String[] args) {
        // 람다 표현식
        // 메서드 대신 하나의 식으로 표현하는 것
        // 익명 함수라고도 함 (1회용 함수. 익명 클래스와 유사!)
        // (매개변수1, 매개변수2, ....) -> { 실행문 } 과 같이 작성
        // 장점 : 일반적으로 코드가 간결해짐, 코드 가독성이 높아짐, 생산성이 높아짐.
        // 단점 : 재사용이 불가능(익명 함수를 사용하는 줄에서 간단하게 한 줄로 작성하고 끝나는 용도이기 때문에), 디버깅 어려움, 재귀함수로는 맞지 않음.

        // 1. 인터페이스 사용하는 기존 방법 (익명 클래스)
        ComputerTool cTool1 = new ComputerTool() { // 익명 클래스
            @Override
            public int compute(int x, int y) {
                return x + y;
            }
        };
        System.out.println(cTool1.compute(1, 2)); // 3 출력

        // 2. 람다식 사용하는 방법 (간결하게)
        // (매개변수1, 매개변수n, ...) -> { 함수에서 수행할 내용; };
        ComputerTool cTool2 = (x, y) -> { return x + y; }; // 방법 1과 동일한 오버라이딩 내용 작성
        // 상술한 코드는 방법 1의 익명 클래스를 만드는 것과 똑같은 코드이다.
        System.out.println(cTool2.compute(1, 2)); // 방법 1보다 훨씬 간결하게 똑같은 결과를 출력 (3 출력)

    }
}
