package inflearn.chap_09.coffee;

public class CoffeeByName {

    //모두 object 조상클래스를 상속 받기떄문에 Integer, Double, String을 다 넣을 수 있음
    public Object name;

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피준비완료" + name);
    }
}
