package ch13generic.lecture;

public class C07wildcard {

    //와일드 카드: 메소드 parameter로 씀
    public void otherMethod() {
        someMethod1(new MyClass07<Dog>());
        someMethod1(new MyClass07<Cat>());//하위타입의 인스턴스는 가능. 애니몰타입의 변수에 캣을 꺼내는게 안전함
        someMethod1(new MyClass07<Animal>());


        someMethod2(new MyClass07<Animal>());
        someMethod2(new MyClass07<Object>()); //상위타입 가능



    }
    public void someMethod1(MyClass07 <? extends Animal> param) {
        Animal item =param.getItem(); //안전. 도그든 캣이든 애니몰 타입의 아이템에 넣을수 있음

    }


    public void someMethod2(MyClass07 <? super Animal> param) { //상위타입이니까 메소드에는
        param.setItem((new Animal())); //이렇게 안전하게 쓰려고 와일드 카드 쓰는것
        param.setItem((new Dog())); //
        param.setItem((new Cat())); //

    }
}

class MyClass07 <T> {
    private T item; //private 밖에서 쓰기 위해 getter, setter 메소드 만듦

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
