package MiniReport;

/*
 류지헌
  놀이동산 입장권 계산 프로그램 (미니 과제 3번)
 */

import java.util.Scanner;

public class JavaReports_03 {
    public static void main(String[] args) {
        System.out.println("[입장권 계산]");
        Scanner sc = new Scanner(System.in);
        int enterFee = 10000;

        System.out.print("나이를 입력해주세요.(숫자):");
        int age = sc.nextInt();

        System.out.print("입장시간을 입력해주세요.(숫자입력):");
        int enterTime = sc.nextInt();

        sc.nextLine(); // data 입력 후 Enter키 소진을 위한 코드

        System.out.print("국가유공자 여부를 입력해주세요.(y/n):");
        String personNationalMeritYN = sc.nextLine();

        System.out.print("복지카드 여부를 입력해주세요.(y/n):");
        String welfareCardYN = sc.nextLine();

        // 무료, 특별 할인, 일반 할인 순으로 할인율이 높으므로 조건 또한 무료-특별 할인-일반 할인 순으로 작성
        if (age < 3) { // 3세 미만 무료
            enterFee = 0;
        } else if (age > 3 && age < 13) { // 13세 미만 특별 할인
            enterFee = 4000;
        } else if (enterTime >= 17) { // 17시 이후 특별 할인
            enterFee = 4000;
        }  else if (("y".equalsIgnoreCase(personNationalMeritYN)) || ("y".equalsIgnoreCase(welfareCardYN))) { // 복지카드, 국가유공자 일반 할인
            enterFee = 8000;
        }

        System.out.println("입장료 : " + enterFee);
        sc.close();
    }
}
