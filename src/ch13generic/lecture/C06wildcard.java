package ch13generic.lecture;

public class C06wildcard {
    public static void main(String[] args) {
        //와일드 카드

        Dog d = new Dog();
        Animal a1 = d;
        Cat c = new Cat();
        Animal a2 = c;

        MyClass06<Dog> o1 = new MyClass06<>();
//        MyClass06<Animal> o2 = o1; //가능할까? 안됨
//        o2.set(new Animal()); //안됨. 실제 인스턴스는 Dog니까 될수 없음.

        MyClass06 <? extends Animal> o3 = o1; //o3타입은 타입파라미터가 애니몰이거나 하위타입인 경우 할당해줌. 도그는 애니몰보다 하위타입이라서 가능,. 가능한 인스턴스타입 My6<Dog>, My6<Cat>, My6<Animal>
        MyClass06 <? extends Animal> o6 = new MyClass06<Animal>();
        MyClass06 <? extends Animal> o7 = new MyClass06<Dog>();
        MyClass06 <? extends Animal> o8 = new MyClass06<Cat>();
//        MyClass06 <? extends Animal> o9 = new MyClass06<Object>(); //상위타입은 안됨

        Animal ani1 = o3.get(); //06의 T가 애니몰 또는 그 하위타입이니까? 애니몰로 안전하게 받을수 있음. get 꺼내는건 안전함. 프로그램 기준으로 in 들어오는것
//        o3.set(new Dog()); //T가 애니몰 또는 그 하위타입으로 결정됐으니까 .......안전하지 않음. My6<Dog>,  My6<Animal>은 되는데 My6<Cat>은 안됨. Cat일 수도 있으니까 오류가 나는것. o1은 Dog니까 Cat은 들어가면 안되는것
//        o3.set(new Dog()); //set. 넣는건 안전하지 않음. set메서드는 인자로 전달된 값을 객체o3인 MyClass06에 저장함
//        o6.set(new Cat()); //안전하지 않음. 이해안됨
//        o7.set(new Dog()); //안전하지 않음
        //Dog 클래스가 Animal 클래스의 하위 타입이지만, o3가 MyClass06<? extends Animal> 타입을 가지고 있기 때문에 실제로는 어떤 하위 타입인지 알 수 없기 때문
        // 예를 들어, o3가 MyClass06<Cat>을 가리키는 경우에는 Dog 객체를 저장할 수 없음

        ani1.animalMethod();  //형변환없이 안전하게 할수 이음. 안전하게 사용하기 위해서 <? extends Animal>을 씀

        MyClass06<? super Animal> o4 = new MyClass06<Animal>(); //와일드카드는 하위타입이라고 명시하거나 특정 타입의 상위타입이라고 명시할 수도 있음. 실제 할당되는 인스턴스는 애니몰 또는 그 상위타입
        MyClass06<? super Animal> o5 = new MyClass06<Object>(); //조상인 오브젝트는 애니몰의 상위타입
//        MyClass06<? super Animal> 10= new MyClass06<Dog>(); //하위타입인 도그나 캣은 안됨
        o4.set(new Dog()); //프로그램 기준으로 데이터 나가는것 out
        o5.set(new Dog());
        o4.set(new Cat());
        o4.set(new Animal());


    }
}

class Animal {
    public void animalMethod() {}
}

class Dog extends Animal{

}

class Cat extends Animal {}



class MyClass06<T> {
    public void set( T param) {}

    public T get() {
        return null;
    }
}
