package Java_Inter_Post_Education.CH12_PolyDesign.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // kakao
        String payOpt1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOpt1, amount1);

        // naver
        String payOpt2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOpt2, amount2);

        // 잘못된 결제 수단 선택
        String payOpt3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOpt3, amount3);
    }
}
