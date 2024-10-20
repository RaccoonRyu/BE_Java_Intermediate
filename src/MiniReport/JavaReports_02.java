package MiniReport;

/*
 류지헌
  결제 금액 캐시백 계산 프로그램 (미니 과제 2번)
 */

import java.util.Scanner;

import static java.lang.Math.floor;

public class JavaReports_02 {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");

        Scanner sc = new Scanner(System.in);
        System.out.print("결제 금액을 입력해 주세요.(금액):");
        int payAmount = sc.nextInt();
        int cashBack = 0;

        if (payAmount / 10 >= 300) {
            cashBack = 300;
        } else {
            cashBack = (payAmount / 1000) * 100; // 1000으로 나눠 나머지.x 중 .x를 절삭하여 100원 단위 cashBack 계산
        }

        System.out.println("결제 금액은 " + payAmount + "원 이고, 캐시백은 " + cashBack + "원 입니다.");
        sc.close();
    }
}
