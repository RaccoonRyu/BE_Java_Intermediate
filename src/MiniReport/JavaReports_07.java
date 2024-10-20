package MiniReport;

/*
 류지헌
  로또 당첨 프로그램 (미니 과제 7번)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class JavaReports_07 {

    // 로또 번호를 생성해주는 사용자 정의 함수 작성
    public static ArrayList createLottoList() {
        // 중복 번호 방지를 위해 HashSet 이용
        HashSet<Integer> numbers = new HashSet();
        for (int j = 0; numbers.size() < 6; j++) {
            int num = (int) (Math.random() * 45) + 1;
            numbers.add(num);
        }

        // 순서 보장을 위해 Set을 넣어 List 생성
        ArrayList<Integer> numberList = new ArrayList(numbers);
        Collections.sort(numberList);

        return numberList;
    }

    public static void main(String[] args) {
        System.out.println("[로또 당첨 프로그램]");
        Scanner sc = new Scanner(System.in);

        // 구입할 로또의 개수 입력
        System.out.print("로또 개수를 입력해 주세요.(숫자 1~10):");
        int lottos = sc.nextInt();

        // 구입한 로또 개수만큼 로또 list 생성
        ArrayList[] lottoList = new ArrayList[lottos];

        // 로또 발행
        for (int i = 0; i < lottos; i++) {
            // 로또 번호를 생성하는 함수 호출하여 로또 list에 대입
            lottoList[i] = createLottoList();

            // 구매한 로또 번호들 출력
            System.out.printf("%c\t%s\n", 'A'+i, lottoList[i].toString().replace("[","").replace("]",""));
        }

        // 당첨 번호 발표
        System.out.println("\n[로또 발표]");
        ArrayList<Integer> winningLottoNum = createLottoList(); // 당첨 번호 생성
        System.out.println("\t" + winningLottoNum.toString().replace("[","").replace("]",""));

        // 구매한 로또 번호 list의 당첨 결과 발표
        int winCount = 0;
        int[] winCnt = new int[lottos];
        for (int i = 0; i < lottoList.length; i++) {
            for (int num : winningLottoNum){
                // 당첨 번호에 구매 번호가 포함되면 일치 당첨 count 증가
                if(lottoList[i].contains(num)) winCount++;
            }
            winCnt[i] = winCount;
            winCount = 0;
        }

        System.out.println("\n[내 로또 결과]");
        for (int i = 0; i < lottos; i++) {
            System.out.printf("%c\t%s => %d개 일치\n", 'A' + i, lottoList[i].toString().replace("[","").replace("]",""),winCnt[i]);
        }
        sc.close();
    }
}
