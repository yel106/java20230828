package ch07extends.book.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child(); //parent가 가리키고 있는건 child인스턴스지만 실제로는 parent를 실행

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//        parent.field2 = "data2"; //불가능
//        parent.method3();//불가능

        //강제 타입 변환
        Child child = (Child) parent; //parent를 child에  넣고싶을때 강제 형변환

        //Child 타입으로 필드와 메소드 사용
        child.field2 = "data2";
        child.method3();

    }


}
