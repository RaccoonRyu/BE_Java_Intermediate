package CH05.MultiArrays;

public class MultiArrays {
    public static void main(String[] args) {
        // 다차원 배열
        // 1. 일차원 배열
        System.out.println("** 일차원 배열 **");
        int[] myArray = {1, 2, 3};
        System.out.println("myArray[1] = " + myArray[1]); // 배열의 인덱스로 배열 원소 값 접근

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]); // i 값에 해당하는 배열의 인덱스로 배열 원소 값 접근
        }

        for (int i : myArray) {
            System.out.println(i);
        }

        // 2. 이차원 배열
        // 자료형[차원][차원] 변수명 = { {}, {} }; or 자료형[][] 변수명 = new 자료형[행][열](사이즈)로 생성
        System.out.println("** 이차원 배열 **");
        int[][] myArray2 = {{1, 2, 3}, {4, 5, 6}}; // 중괄호 안에 중괄호로 초기화
        System.out.println("myArray2[1][2] = " + myArray2[1][2]); // 1행 2열 원소 값인 6 출력 (행, 열 모두 인덱스 0부터 시작)

        for (int i = 0; i < myArray2.length; i++) { // myArray2.length : 이차원 배열의 가장 바깥, 즉 행 길이
            for (int j = 0; j < myArray2[i].length; j++) { // myArray2[i].length : 이차원 배열의 열 길이
                System.out.println(myArray2[i][j]);
            }
        } // 1, 2, 3, 4, 5, 6 출력 (2행 3열을 순회하며 모든 데이터를 출력)

        for (int[] ints : myArray2) { // 2차원 배열 myArray2에서 1차원 배열 ints 하나를 꺼내온다는 의미
            for(int anInt : ints) { // 위에서 꺼내온 1차원 배열 ints의 모든 원소를 순회
                System.out.println("anInt : " + anInt);
            }
        } // 1, 2, 3, 4, 5, 6 출력 (2행 3열을 순회하며 모든 데이터를 출력)

        // Q1. 아래와 같은 3x3 행렬이 2차원 배열로 초기화 돼있을 때, 모든 원소를 1로 변경하고, 대각 원소는 10으로 변경
        int[][] testArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {
                testArray1[i][j] = 1;
                if (i == j) { // 대각 원소 : 행과 열의 인덱스 번호가 같은 원소
                    testArray1[i][j] = 10; // 대각 원소는 10으로 변경
                }
                System.out.println(testArray1[i][j]);
            }
        }

        for (int[] itemRow : testArray1) {
            for (int itemCol : itemRow) {
                System.out.print(itemCol + " ");
            }
            System.out.println();
        }

    }
}
