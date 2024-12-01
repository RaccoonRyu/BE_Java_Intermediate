package Java_Inter_Post_Education.CH03_OOP;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        // 순서, 절차에 맞춰서 작성된 프로그램 (절차지향 프로그래밍)
        // 음악 플레이어에 관련된 데이터를 묶어 사용하기 위해 클래스를 사용했지만 아직은 절차지향 프로그래밍!

        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가 두번
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);

        // 볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);

        // 음악 플레이어 상태 확인
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn) {
            System.out.println("음악 플레이어 ON. 현재 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

}
