package Java_Inter_Post_Education.CH06_AccessModifier;

public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    // public method : 입금
    public void deposit(int amount) {

        // 검증 로직 추가
        if(isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public method : 출금
    public void withdraw(int amount) {
        // 검증 로직 추가
        if(isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public method : 잔액 확인
    public int getBalance() {
        return balance;
    }

    // 내부에서만 사용할 private method
    // 금액이 올바른지 확인하는 메서드
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}
