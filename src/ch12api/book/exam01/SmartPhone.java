package ch12api.book.exam01;

public class SmartPhone {
    private String company;
    private String os;


    //생성자는 Alt+ insert쓰면 더 쉽게 생성가능
    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }


    //object toString() 메소드를 재정의해서 company, os를리턴하도록 함
    @Override
    public String toString() {
        return company + "," + os;
    }
}
