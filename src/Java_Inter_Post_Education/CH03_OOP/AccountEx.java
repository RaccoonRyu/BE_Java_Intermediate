package Java_Inter_Post_Education.CH03_OOP;

public class AccountEx {
    int balance;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("현재 잔액은 " + balance +" 원 입니다.");
    }

    public void withDraw(int amount) {
        if(amount > balance) {
            System.out.println("잔액이 부족합니다. 계좌 잔액 : " + balance);
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 현재 잔액은 " + balance + "원 입니다.");
        }
    }
}
