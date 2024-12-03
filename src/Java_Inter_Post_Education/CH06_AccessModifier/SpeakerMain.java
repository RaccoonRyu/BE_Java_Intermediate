package Java_Inter_Post_Education.CH06_AccessModifier;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근 - 스피커 폭발(....)
        // private 접근 제어자를 통해 이를 막을 수 있다.
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200; // volume 필드가 private으로 선언되어 직접 접근 불가
        speaker.showVolume();
    }
}
