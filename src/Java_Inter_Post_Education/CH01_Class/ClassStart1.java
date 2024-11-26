package Java_Inter_Post_Education.CH01_Class;

public class ClassStart1 {
    public static void main(String[] args) {
        String[] studentName = {"학생1", "학생2"};
        int[] studentAge = {15, 16};
        int[] studentGrade = {90, 80};

        // 학생을 추가하는 부분을 배열로 축약했으나, 한 명의 학생 입장에서 데이터가 3개의 변수에 나누어져있다.
        // 따라서 학생의 데이터를 변경할 때 모든 배열의 인덱스에 매우 유의해야하고, 각 배열을 모두 변경해야한다는 단점이 있다.
        // 이런 정보는 사람이 관리하기 불편하기 때문에, 학생이라는 개념을 하나로 묶어 각 학생별로 이름/나이/성적을 관리하는 것이 편리하다.
        // 이를 위해 클래스라는 개념을 사용한다!

        for (int i = 0; i < studentName.length; i++) {
            System.out.println("이름 : " + studentName[i] + " 나이 : " + studentAge[i] + " 성적 : " + studentGrade[i]);
        }
    }
}
