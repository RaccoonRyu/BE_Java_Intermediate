package Java_Inter_Post_Education.CH12_PolyDesign.ex.pay0;

// OCP에 따라 변하는 부분
// 결제 수단들을 관리하는 추상 클래스
public abstract class PayStore {

    public static Pay findPay(String opt) {
        // opt에 맞는 Pay를 반환하는 함수
        if("kakao".equals(opt)) {
            return new KakaoPay();
        } else if ("naver".equals(opt)) {
            return new NaverPay();
        } else if ("new".equals(opt)) {
            return new NewPay();
        }else {
            return new DefaultPay();
        }

    }
}
