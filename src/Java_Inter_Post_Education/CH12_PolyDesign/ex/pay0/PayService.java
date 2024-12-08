package Java_Inter_Post_Education.CH12_PolyDesign.ex.pay0;

import static Java_Inter_Post_Education.CH12_PolyDesign.ex.pay0.PayStore.findPay;

// OCP에 따라 변하지 않는 부분이면서 핵심 클라이언트 코드인 PayService
// 해당 클래스는 Pay라는 역할은 알고있지만(의존), 구체적인 구현(카카오, 네이버 등)은 모른다.
// 핵심은 Pay가 몇 개가 추가로 구현되든 PayService의 코드가 변경되지 않는 것이다!
public class PayService {

    public void processPay(String opt, int amount) {

        System.out.println("결제를 시작합니다. : option = " + opt + ", amount = " + amount);

        Pay pay = findPay(opt);
        boolean result = pay.pay(amount);

        if(result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패헀습니다.");
        }
    }
}
