package Java_Inter_Post_Education.CH03_OOP;

public class AccountMain {
    public static void main(String[] args) {
        AccountEx account = new AccountEx();
        int amount = 10000;

        account.deposit(10000);
        account.withDraw(9000);
        account.withDraw(2000);
    }
}
