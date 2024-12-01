package Java_Inter_Post_Education.CH03_OOP;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        // 순서, 절차에 맞춰서 작성된 프로그램 (절차지향 프로그래밍)
        // 음악 플레이어에 관련된 데이터를 묶어 사용하기 위해 클래스를 사용했고, 메서드를 아래로 추출했지만 아직은 절차지향 프로그래밍!\
        // 왜냐면 여전히 순서(절차)를 중요시하고, 객체의 데이터(MusicPlayerData)와 기능(메서드-MusicPlayerMain3)이 분리되어있기 때문에!

        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가 두번
        volumeUp(data);
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태 확인
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }

    public static void on(MusicPlayerData data) {
        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    public static void off(MusicPlayerData data) {
        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    public static void volumeUp(MusicPlayerData data) {
        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    public static void volumeDown(MusicPlayerData data) {
        // 볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    public static void showStatus(MusicPlayerData data) {
        // 음악 플레이어 상태 확인
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn) {
            System.out.println("음악 플레이어 ON. 현재 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
