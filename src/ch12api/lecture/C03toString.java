package ch12api.lecture;

public class C03toString {
    public static void main(String[] args) {
        Car car1 = new Car("tesla", 5000);
        Car car2 = new Car("kia", 3000);
        Car car3  = new Car("bmw", 2000);

        System.out.println(car1.getModel() + ":" + car1.getPrice());
        System.out.println(car2.getModel() + ":" + car2.getPrice());
        System.out.println(car3.getModel() + ":" + car3.getPrice());

        //toString 메소드를 재정의해서 새로운 내용이 출력됨.
        // 위와 같이 복잡하게 안쓰고
        // toString메소드를 통해 코드를 간결하게
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());





    }
}

class Car {
    private String model;
    private int price;


    public Car(String model, int price) {  //알트 인서트로 생성자 만들기
        this.model = model;
        this.price = price;
    }

    public String getModel() { //알트 인서트로 getter메소드 만들기
        return model;
    }

    public int getPrice() {
        return price;
    }


//    @Override
//    public String toString() {
//        return this.model + ":" + this.price;
//    }


    //ALt + insert로 만들기
    //객체를 설명하는 문자열 리턴
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
