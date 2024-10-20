package MiniReport;

/*
 류지헌
  연소득 과세금액 계산 프로그램 (미니 과제 8번)
 */

import java.util.Scanner;

public class JavaReports_08 {

    // 종합소득세율표를 이용한 세금 계산을 위한 사용자 정의 함수 작성
    public static void calYearTax(int yearIncome, int[] taxBases, double[] taxes) {
        // 과세 표준 구간을 알기 위한 taxBase와 과세 총액을 위한 taxSum
        int taxBase = 0;
        int taxSum = 0;

        // 연소득이 과세 표준에 완전히 표함되는 세금 총액 계산
        for (int i = 0; i < taxBases.length; i++) {
            // 과세표준 중 가장 높은 구간이거나 연소득이 과세표준보다 낮은 경우 break
            if( taxBase == 7 || (int) (yearIncome / taxBases[taxBase + 1]) == 0 ) {
                break;
            }
            // 소득이 0인 경우(세율도 0)가 있으므로 (다음 과세표준 - 현재 과세표준) * 다음 과세표준의 세율 = 해당 구간의 세금 ex. (12000000 - 0) * 0.06
            System.out.println(String.format("%12d * %2d%% = %12d", taxBases[taxBase+1] - taxBases[i], (int) (taxes[i] * 100), (int) ((taxBases[taxBase+1] - taxBases[i]) * taxes[i])));
            taxSum += (int) ((taxBases[taxBase+1] - taxBases[i]) * taxes[i]);
            // taxBase가 증가하여 loop 마다 다음 과세 구간에서 세금 계산
            taxBase++;
        }

        // 연소득이 과세 표준에 부분 포함되는(마지막 과세 표준) 세금 계산
        if(yearIncome - taxBases[taxBase] > 0) {
            // (연소득 - 마지막 과세표준) * 마지막 과세표준의 세율
            System.out.println(String.format("%12d * %2d%% = %12d", yearIncome - taxBases[taxBase], (int) (taxes[taxBase] * 100),
                    (int) ((yearIncome - taxBases[taxBase]) * taxes[taxBase])));
            taxSum += (int) ((yearIncome - taxBases[taxBase]) * taxes[taxBase]);
        }

        // 세금 총액 출력
        System.out.printf("[세율에 의한 세금]:\t\t %d\n", taxSum);

    }

    // 누진공제를 이용한 세금 계산을 위한 사용자 정의 함수 작성
    public static void calYearGradu(int yearIncome, int[] taxBases, double[] taxes, int[] graduatedDeductions) {
        // 과세 표준 구간을 위한 taxBase
        int taxBase = 0;

        // 최종 과세 표준 구간을 알기위해 taxBase 계산
        for (int i = 0; i < taxBases.length; i++) {
            // 과세표준 중 가장 높은 구간 연소득이 과세표준보다 낮은 경우 break
            if( taxBase == 7 || (int) (yearIncome / taxBases[taxBase + 1]) == 0 ) {
                break;
            }
            // loop 돌며 최종 과세 표준 구간을 확인
            taxBase++;
        }

        // 누진 공제 세금 계산 식 : (연소득 * 연소득이 과세 표준에 포함되는 세율) - 해당 과세 표준의 누진공제 금액
        // 세금 총액 출력 - int와 double 계산 중 값 손실 가능성이 있으므로 round()로 반올림
        System.out.printf("[세율에 의한 세금]:\t\t %d\n", Math.round((yearIncome * taxes[taxBase]) - graduatedDeductions[taxBase]));
    }

    public static void main(String[] args) {
        // 종합 소득 세율표에 따른 과세표준, 세율, 누진공제 배열
        int[] taxBases = {0, 12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000, 1000000001};
        double[] taxes = {0.06, 0.15, 0.24, 0.35, 0.38, 0.40, 0.42, 0.45};
        int[] graduatedDeductions = {0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000};

        System.out.println("[과세 금액 계산 프로그램]");
        Scanner sc = new Scanner(System.in);

        System.out.print("연소득을 입력해 주세요.:");
        int yearIncome = sc.nextInt();

        // 종합소득세율표 세금 계산 함수 호출
        calYearTax(yearIncome, taxBases, taxes);

        // 누진공제 세금 계산 함수 호출
        calYearGradu(yearIncome, taxBases, taxes, graduatedDeductions);

    }
}
