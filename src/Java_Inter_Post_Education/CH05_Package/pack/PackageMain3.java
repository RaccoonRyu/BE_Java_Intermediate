package Java_Inter_Post_Education.CH05_Package.pack;

import Java_Inter_Post_Education.CH05_Package.pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        // 여러 개의 클래스가 패키지로 구분되지만 클래스명이 같은 경우, 모든 클래스를 사용하기 위해서는 하나를 제외하고 모두 전체 경로를 적어주어야한다.
        // 즉 import는 하나만 할 수 있다.
        User userA = new User();
        Java_Inter_Post_Education.CH05_Package.pack.b.User userB = new Java_Inter_Post_Education.CH05_Package.pack.b.User();
    }
}
