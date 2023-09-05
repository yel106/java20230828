package ch16lambda.book.exam07;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        // (a,b) -> a.compareToIgnoreCase(b); //아래 코드와 같은것
        person.ordering(String::compareToIgnoreCase);
    } //대소문자 구분없이 사전 순서대로
}
