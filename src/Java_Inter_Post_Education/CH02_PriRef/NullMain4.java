package Java_Inter_Post_Education.CH02_PriRef;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 이렇게 Data를 bigData 안에 생성해주면 NPE가 발생하지 않는다.
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        System.out.println("bigData.data.value = " + bigData.data.value); // NPE 발생!!!!
        // 따라서 NPE가 발생하면, null 값에 .(dot)을 찍었다고 생각하여 문제를 찾으면 쉽다.
    }
}
