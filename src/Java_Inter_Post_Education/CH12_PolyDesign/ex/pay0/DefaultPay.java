package Java_Inter_Post_Education.CH12_PolyDesign.ex.pay0;

// 결제수단이 없는 경우 null 체크를 방지하기 위한 기본 결제수단 클래스
// null 대신 해당 클래스의 객체를 쓴다고 해서 null object pattern이라고 한다.
// 해당 패턴을 사용하면 null 체크 로직을 지울 수 있고, 항상 Pay의 인스턴스를 반환함이 보장된다.
// 즉, 최악의 경우에도 null을 반환하지 않고 DefaultPay를 반환한다는 것이다.
public class DefaultPay implements Pay{
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
