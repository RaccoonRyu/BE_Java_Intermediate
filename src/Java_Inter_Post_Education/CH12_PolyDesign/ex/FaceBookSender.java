package Java_Inter_Post_Education.CH12_PolyDesign.ex;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String msg) {
        System.out.println("페이스북에 발송합니다. : " + msg);
    }
}
