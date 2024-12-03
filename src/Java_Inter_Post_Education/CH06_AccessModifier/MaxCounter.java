package Java_Inter_Post_Education.CH06_AccessModifier;

public class MaxCounter {
    private int count;
    private int max;

    MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(count < max) {
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }

        // if-else 대신 return 문을 사용하여 검증 로직과 실행 로직을 명확하게 분리할 수도 있다.
    }

    public int getCount() {
        return count;
    }
}
