package ch12api.lecture;


//해쉬 코드 리턴값이  같아야 equals리턴값이 같은지 아닌지 확인가능. 해쉬코드가 다르면 다른객체니까.

public class C07equals {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07("박지성");
        MyClass07 o2 = new MyClass07("박지성");
        MyClass07 o3 = new MyClass07("박지성");
        MyClass07 o4 = new MyClass07("박지성");

        System.out.println(o1 == o2); //참조값이 서로 다름
        System.out.println(o1.equals(o2)); //재정의 안했으니까 true가 안나옴 . true로 나오게 하려면? 재정의하자

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode()); //해쉬코드가 다르면 원래 위반이기 때문에 해쉬코드도 재정의 해줘야함

        System.out.println(o1.equals(o1));
        System.out.println(o1.equals(o1));
        System.out.println(o1.equals(o3));

    }
}

class MyClass07 {
    private String name;

    public MyClass07(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        //필드네임이 같으면 이퀄이 tree로 나오게 하는게 목적
        MyClass07 o = (MyClass07) obj;
        return this.name.equals(o.name);
    }


    //해쉬 코드를재정의해줘서 이제 같게 나옴
    @Override
    public int hashCode() {
        return  name.hashCode();
    }
}

