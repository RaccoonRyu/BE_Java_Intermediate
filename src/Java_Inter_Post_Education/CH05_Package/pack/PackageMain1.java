package Java_Inter_Post_Education.CH05_Package.pack;

import Java_Inter_Post_Education.CH05_Package.pack.a.User; // 다른 패키지의 클래스를 사용하기 위해 import
// 만약 import 하지 않으면 패키지 전체 경로를 포함해서 클래스를 적어주어야 한다. (13 라인)

public class PackageMain1 {
    public static void main(String[] args) {
        // 같은 패키지의 Data 클래스 객체 생성
        Data data = new Data();

        // 다른 패키지의 User 클래스 객체 생성
        User user = new User();
        Java_Inter_Post_Education.CH05_Package.pack.a.User user2 = new User();

    }
}
