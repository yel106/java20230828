package ch11exception.book.exam07;

import ch09nested.exam04.A;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        //예금하기
        account.deposit(10000);
        System.out.println("예금액:" + account.getBalnace());

        //출금하기
        try {
            account.withdraw(30000); //예외처리 코드와 함께 withdraw 메소드 호출



        }catch(InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
