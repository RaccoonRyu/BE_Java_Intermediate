package Java_Inter_Post_Education.CH12_PolyDesign.ex;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS를 발송합니다. : " + msg);
    }
}
