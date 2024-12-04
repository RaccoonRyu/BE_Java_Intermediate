package Java_Inter_Post_Education.CH07_MemoryStructure.static2;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("sum : " + MathArrayUtils.sum(values));
        System.out.println("avg : " + MathArrayUtils.avg(values));
        System.out.println("min : " + MathArrayUtils.min(values));
        System.out.println("max : " + MathArrayUtils.max(values));
    }
}
