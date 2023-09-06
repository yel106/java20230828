package ch12api.book.확인문제17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
//    public static void main(String[] args) {
//        String id = "5Angel1004";
//        String regExp = "[a-zA-Z]+[\\w]{8-12}";
//        boolean isMatch= true;
//        if(isMatch) {
//            System.out.println("ID로 사용할 수 있습니다.");
//        } else {
//            System.out.println("ID로 사용할 수 없습니다.");
//        }
//    }
//}

    public static void main(String[] args) {
        String id = "5Angel1004";
        String regExp = "[a-zA-Z][\\w]{7,11}";
//        boolean isMatch= id.matches(regExp);
        boolean isMatch = Pattern.matches(regExp, id); //앞에가 String regex, 뒤에가 확인할 내용
        if(isMatch) {
            System.out.println("ID로 사용할 수 있습니다.");
        } else {
            System.out.println("ID로 사용할 수 없습니다.");
        }
    }
}