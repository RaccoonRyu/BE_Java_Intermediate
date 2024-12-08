package Java_Inter_Post_Education.CH12_PolyDesign.ex;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String msg) {
        System.out.println("메일을 발송합니다. : " + msg);
    }
}
