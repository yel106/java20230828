package ch16lambda.book.exam08;

public class Person {
    public Member getMember1(Creatable1 creatable) {
        String id = "winter";
        Member member = creatable.create(id);
        return member;
    }

    public Member getMember2(Creatable2 creatable) { //creatable이 뭐든간에 Creatable2 추상메소드를 가지고 있기 때문에 뭐가오든 상관없다. ?
        String id = "winter";
        String name = "한겨울";
        Member member = creatable.create(id, name);
        return member;
    }

}
