package Java_Inter_Post_Education.CH03_OOP;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        // 순서, 절차에 맞춰서 작성된 프로그램 (절차지향 프로그래밍)

        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가 두번
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        // 볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        // 음악 플레이어 상태 확인
        System.out.println("음악 플레이어 상태 확인");
        if(isOn) {
            System.out.println("음악 플레이어 ON. 현재 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
