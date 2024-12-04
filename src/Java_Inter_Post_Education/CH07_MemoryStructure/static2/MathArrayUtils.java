package Java_Inter_Post_Education.CH07_MemoryStructure.static2;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        return sum;
    }

    public static double avg(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minVal = Integer.MAX_VALUE; // minVal을 values의 [0]으로 비교할 수도 있다.

        for (int value : values) {
            if(value < minVal) {
                minVal = value;
            }
        }

        return minVal;
    }

    public static int max(int[] values) {
        int maxVal = Integer.MIN_VALUE; // maxVal values의 [0]으로 비교할 수도 있다.

        for (int value : values) {
            if(value > maxVal) {
                maxVal = value;
            }
        }
        return maxVal;
    }
}
