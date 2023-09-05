package ch16lambda.book.exam02;

public class Person {
    public void action(Workable workable) { //Workable의 어떤 것이 들어오든 상관없음
        workable.work();
    }
}
