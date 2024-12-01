package Java_Inter_Post_Education.CH03_OOP;

public class MusicPlayer {
    // 객체 지향을 통한 MusicPlayer 클래스 작성
    // 속성(데이터)과 기능(메서드)를 하나의 객체 안에서 함께 정의한다.
    // 캡슐화 : 속성과 기능을 하나(클래스)로 묶어 필요한 기능을 메서드를 통해 외부에 제공하는 것

    int volume = 0;
    boolean isOn = false;

    public void on() {
        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    public void off() {
        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    public void volumeUp() {
        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    public void volumeDown() {
        // 볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    public void showStatus() {
        // 음악 플레이어 상태 확인
        System.out.println("음악 플레이어 상태 확인");
        if(isOn) {
            System.out.println("음악 플레이어 ON. 현재 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
