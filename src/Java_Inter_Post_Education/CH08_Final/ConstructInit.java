package Java_Inter_Post_Education.CH08_Final;

public class ConstructInit {
    final int value; // 멤버 변수를 final로 선언하면, 최초에 바로 초기화 하거나 아래처럼 생성자를 통해서 한번 초기화할 수 있다.

    public ConstructInit(int value) {
        this.value = value; // 이후에는 해당 값 변경 불가
    }

}
