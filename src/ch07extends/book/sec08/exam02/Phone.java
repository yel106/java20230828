package ch07extends.book.sec08.exam02;

public class Phone {

    public String model;
    public String color;

    //매개변수 갖는 생성자 선언
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자 실행"  );
    }

}
