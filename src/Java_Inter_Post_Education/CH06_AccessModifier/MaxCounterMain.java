package Java_Inter_Post_Education.CH06_AccessModifier;

public class MaxCounterMain {
    public static void main(String[] args) {
        MaxCounter maxCounter = new MaxCounter(3);
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();

        System.out.println("카운트 : " + maxCounter.getCount());
    }
}
