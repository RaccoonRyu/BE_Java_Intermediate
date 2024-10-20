package MiniReport;

/*
 류지헌
 콘솔 화면에 구구단 출력하기 (미니 과제 1번)
 */

public class JavaReports_01 {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(String.format("%02d x %02d = %02d\t", j, i, i * j));
            }
            System.out.println();
        }
    }
}
