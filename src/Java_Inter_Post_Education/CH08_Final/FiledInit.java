package Java_Inter_Post_Education.CH08_Final;

public class FiledInit {
    static final int CONST_VALUE = 10; // 변수에 static final이 붙으면(상수) 대문자 + 스네이크케이스로 작성한다
    final int value = 10;

    public FiledInit(int value) {
        //this.value = value; // final로 선언된 멤버 변수가 이미 초기화된 상태면 생성자에서도 값 변경 불가
    }

    public FiledInit() {
    }
}
