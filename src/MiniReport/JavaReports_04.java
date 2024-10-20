package MiniReport;

/*
 류지헌
  주민등록번호 생성 프로그램 (미니 과제 4번)
 */

import java.util.Scanner;

public class JavaReports_04 {
    public static void main(String[] args) {
        System.out.println("[주민등록번호 계산]");
        Scanner sc = new Scanner(System.in);

        System.out.print("출생년도를 입력해주세요.(yyyy):");
        String birthYear = sc.next();

        System.out.print("출생월을 입력해주세요.(mm):");
        int birthMonth = sc.nextInt();

        System.out.print("출생일을 입력해주세요.(dd):");
        int birthDay = sc.nextInt();

        System.out.print("성별을 입력해주세요.(m/f):");
        String gender = sc.next();

        // 성별 체크
        int genderNum = 0;
        if ("m".equalsIgnoreCase(gender)) { // 남성
            genderNum = 3;
        } else if ("f".equalsIgnoreCase(gender)) { // 여성
            genderNum = 4;
        } else { // m이나 f 외 입력 시 메시지 출력하고 프로그램 종료
            System.out.println("잘못된 성별 입력입니다.");
            return;
        }

        // 나머지 6자리 난수 생성 (000001~999999)
        int otherNumbers = (int) (Math.random() * 999999) + 1;

        // 주민번호 출력
        // 생년은 String을 substring하여 두자리만, 나머지 생월/일은 1자리 숫자가 들어와도 두 자리로(1 -> 01) 출력, 임의번호는 6자리 미만이 들어와도 여섯 자리로 출력(1 -> 000001)
        System.out.printf("%s" + "%02d" + "%02d" + "-" + genderNum + "%06d\n", birthYear.substring(2,4), birthMonth, birthDay, otherNumbers);
        sc.close();
    }
}
