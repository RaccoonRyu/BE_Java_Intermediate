package Java_Inter_Post_Education.CH06_AccessModifier;

public class Speaker {
    // private : 해당 클래스 내부에서만 호출할 수 있도록 제어하는 접근 제어자
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 볼륨 : " + volume);
    }
}
