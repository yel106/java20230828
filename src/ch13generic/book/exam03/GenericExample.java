package ch13generic.book.exam03;

public class GenericExample {
    //제네릭 메소드
    public static <T> Box<T> boxing(T t) {  //리턴값과 파라미터에 T
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }


    public static void main(String[] args) {
        //제네릭 메소드 호출
        Box<Integer> box1 = boxing(100); //원래라면 <Integer> boxing이라고 해야하는데 파라미터와 리턴타입에 지정했으니까 앞에 안써도 되는것.
        int intValue = box1.get();
        System.out.println(intValue);



        //제네릭 메소드 호출
        Box<String > box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);

    }
}
