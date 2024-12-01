package Java_Inter_Post_Education.CH03_OOP;

public class MusicPlayerMain4 {
    // MusicPlayer 클래스 사용
    // 해당 클래스는 속성(데이터)과 기능(메서드)를 하나의 객체 안에서 함께 정의한다.

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // 음악 플레이어 켜기
        player.on();

        // 볼륨 증가 두번
        player.volumeUp();
        player.volumeUp();

        // 볼륨 감소
        player.volumeDown();

        // 음악 플레이어 상태 확인
        player.showStatus();

        // 음악 플레이어 끄기
        player.off();

        // 뮤직 플레이어 객체를 생성하고 필요한 기능(메서드)을 호출하기만 하면 된다!
    }

}
