package inflearn.chap_09.coffee;

public class CoffeeByNumber {
    public int watingNumber;

    //Alt + insert  생성자 만들기
    public CoffeeByNumber(int watingNumber) {
        this.watingNumber = watingNumber;
    }

    public void ready() {
        System.out.println("커피 준비 완료: "+ watingNumber);
    }
}

