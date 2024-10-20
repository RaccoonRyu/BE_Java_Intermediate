package MiniReport;

/*
 류지헌
  달력 출력 프로그램 (미니 과제 5번)
  기타 하고 싶은 말 : 가로 출력은 도저히 생각이 안나서 하지 못했습니다 ...
 */

import java.time.LocalDate;
import java.util.Scanner;

public class JavaReports_05 {
    public static void main(String[] args) {
        System.out.println("[달력 출력 프로그램]");
        Scanner sc = new Scanner(System.in);

        System.out.print("달력의 년도를 입력해주세요.(yyyy):");
        int calYear = sc.nextInt();

        System.out.print("달력의 월을 입력해주세요.(mm):");
        int calMonth = sc.nextInt();

        // 전월부터 출력을 위한 calMonth 가공
        calMonth -= 1;

        System.out.println();

        // 3개월분의 달력 출력
        for (int i = 0; i < 3; i++) {
            // 연, 월 출력
            System.out.printf("[" + calYear + "년 %02d월]\n", calMonth);
            System.out.println("일\t월\t화\t수\t목\t금\t토");

            // 연, 월 정보 가공
            LocalDate firstDate = LocalDate.of(calYear, calMonth, 1); // 입력받은 연 월의 전월 1일 정보 얻기
            int firstDateValue = firstDate.getDayOfWeek().getValue(); // 해당 월의 첫번째 날의 요일 정보 (getValue() : 월요일 1 ~ 일요일 7)
            int lastDate = firstDate.lengthOfMonth(); // 해당 월의 마지막 날짜 정보

            // 매 월의 1일에 해당하는 요일까지 공백 출력
            for (int j = 0; j < (firstDateValue % 7); j++) {
                System.out.print("\t");
            }

            // 날짜 출력 (1일~말일)
            for (int date = 1; date <= lastDate; date++) {
                System.out.printf("%d\t", date);
                LocalDate currentDay = firstDate.withDayOfMonth(date);

                // 토요일마다 줄바꿈 (getValue() : 토요일 6)
                if (currentDay.getDayOfWeek().getValue() % 6 == 0) {
                    System.out.println();
                }
            }
            // 각 월간 줄바꿈
            System.out.println();

            // 다음 달 출력을 위한 연, 월 증가
            calMonth++;
            if (calMonth > 12) {
                calMonth = 1; // 월이 12를 넘으면 다음 해 1월로 이동
                calYear++; // 연도 증가
            }
        }
        sc.close();
    }
}
