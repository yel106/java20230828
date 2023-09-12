package ch11exception.book.exam07;

public class Account {
    private long balance;

    public Account() { }

    public long getBalnace() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;

    }

    public void withdraw(int money) throws InsufficientException {
        if(balance < money ) {
            throw new InsufficientException("잔고부족: " + (money-balance)+" 모자람");
        }
        balance-= money;
    }


}
