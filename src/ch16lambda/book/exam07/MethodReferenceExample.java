package ch16lambda.book.exam07;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.ordering(String::compareToIgnoreCase); // (a,b) -> a.compareToIgnoreCase(b)
    }
}
