package MiniReport;

/*
 류지헌
  가상 선거 및 당선 시뮬레이션 프로그램 (미니 과제 6번)
 */

import java.util.Random;
import java.util.Scanner;

public class JavaReports_06 {
    public static void main(String[] args) {
        System.out.println("[가상 선거 및 당선 시뮬레이션 프로그램]");
        Scanner sc = new Scanner(System.in);

        System.out.print("총 진행할 투표수를 입력해주세요.");
        int voteNum = sc.nextInt();

        System.out.print("가상 선거를 진행할 후보자 인원을 입력해주세요.");
        int candidateNum = sc.nextInt();

        // 후보자 수 만큼 Scanner로 입력하여 String[] 생성
        String[] candidates = new String[candidateNum];
        for (int i = 0; i < candidateNum; i++) {
            System.out.print((i + 1) + "번째 후보자 이름을 입력해주세요.");
            candidates[i] = sc.next();
        }

        // 추후 후보자별 총 투표수를 담을 배열 생성
        int[] sumVotesNum = new int[candidateNum];

        // 난수 생성을 위한 Random 생성
        Random random = new Random();

        // 투표 진행
        for (int i = 0; i < voteNum; i++) {
            int voteResult = random.nextInt(candidateNum); // 임의의 후보자에게 투표하기 위한 난수 생성
            ++sumVotesNum[voteResult]; // 위에서 생성한 임의 후보자 투표 난수로 투표 ex. voteResult = 3이면 4번째(index = 3) 후보자에게 투표

            System.out.printf("[투표진행률]: %.2f%%, %d명 투표 => %s\n", Math.round((float) (i + 1) / voteNum * 10000) / 100.0, i + 1, candidates[voteResult]);

            for (int j = 0; j < candidateNum; j++) {
                System.out.printf("[기호:%d]\t%s\t%.2f%%\t(투표수:\t%d)\n", j + 1, candidates[j] + ":",
                        Math.round((float) sumVotesNum[j] / voteNum * 10000) / 100.0, sumVotesNum[j]);
            }
            System.out.println();
        }

        // 당선자 발표
        // 당선자 발표를 위한 개표 수, 당선자 변수 생성
        int openVotes1 = 0;
        int openVotes2 = 0;
        String electedCan = "";

        for (int i = 0; i < candidateNum; i++) { // 후보자 수 만큼 loop 수행하며 개표 수 비교 및 당선자 선출
            if (sumVotesNum[i] > openVotes1) {
                openVotes1 = sumVotesNum[i];
                electedCan = candidates[i];
            } else if (sumVotesNum[i] == openVotes1) {
                openVotes2 = openVotes1;
            }
        }

        System.out.println("[투표결과] 당선인 : " + electedCan);
        sc.close();
    }
}
