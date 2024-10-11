package CH04.Iteration;

public class ForWhile {
    public static void main(String[] args) {
        // 반복문
        // 1. for
        System.out.println("** for **");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        } // 0, 1, 2, 3, 4 순으로 출력

        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        } // 별찍기 별 1, 2, 3, 4, 5개 출력

        // for - continue, break
        System.out.println("** continue, break **");
        for (int i = 0; i < 5; i++) {
            if (i==2) continue; // 반복문 수행 중 continue문을 만나면 해당 코드 아래는 실행하지 않고 다음 반복으로로 넘어감
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        } // 별찍기 별 1, 2, 4, 5개 출력

        for (int i = 0; i < 5; i++) {
            if (i==2) break; // 반복문 수행 중 break문을 만나면 반복문을 탈출함
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        } // 별찍기 별 1, 2개 출력

        // 1-1. for each
        System.out.println("** for each **");
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]); // nums의 인덱스(i)에 해당하는 값을 출력
        } // 1, 2, 3, 4, 5 출력

        // foreach : 좌측은 우측 반복 대상을 사용할 변수(변수이름은 크게 무관), 우측은 반복하려는 대상
        for (int num : nums) { // 대상의 모든 원소를 순회할 때 사용하면 유용하다.
            System.out.println(num);
        } // 1, 2, 3, 4, 5 출력

        // 2. while
        System.out.println("** while **");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        } // 0, 1, 2, 3, 4 출력

        // while - continue, break
        i = 0;
        while (i < 5) {
            if(i == 2) {
                i++;
                continue; // for와 동일하게 continue문을 만나면 해당 코드 아래는 실행하지 않고 다음 반복으로 넘어감
            }
            System.out.println(i);
            i++;
        } // 0, 1, 3, 4 출력

        i = 0;
        while (i < 5) {
            if(i == 2) {
                break; // for와 동일하게 break문을 만나면 반복문을 탈출함
            }
            System.out.println(i);
            i++;
        } // 0, 1 출력

        // 2-1. do-while
        System.out.println("** do-while");
        boolean knock = false;
        do {
            System.out.println("knock"); // do-while : 해당 문장은 조건문과 무관히 무조건 한번 수행됨
        } while(knock); // do-while문은 while(조건문) 다음에 꼭 세미콜론(;) 붙여야함


        System.out.println("** Q1 **");
        // 별 찍기 문제 1, 3, 5, 7개
        for (int j = 0; j < 8; j++) {
            if(j % 2 == 0) continue;
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.println();
        } // j가 짝수일 때는 continue로 건너뛰어 별을 찍지 않고, 홀수일 때는 별을 찍음

        System.out.println("** Q2 **");
        // 반복문을 실행할 때 마다 물 온도를 1도씩 올리고 100도가 되면 종료. 10도 단위로 물 온도 출력
        int waterTemp = 0;
        while (waterTemp < 100) {
            waterTemp++;
            if (waterTemp % 10 == 0) {
                System.out.println("물온도 : "+ waterTemp + "도");
            }
        }
    }
}
