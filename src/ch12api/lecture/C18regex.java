package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        // regex = regular expression(정규 표현식,  정규식, 정규식 표현)
        //문자열의 패턴을 나타내는 기호

        //문자
        System.out.println("x".matches("x")); //true
        System.out.println("a".matches("a")); //true a라는 글자는 a라는 패턴과 일치.
        System.out.println("a".matches("x")); //false a라는 글자는 x라는 패턴고 일치 하지 않음

        //문자들
        System.out.println("xyz".matches("xyz")); //true
        System.out.println("xxx".matches("xyz")); //false. xxx는 xyz패턴과 일치하지 않음
        System.out.println("xxx".matches("x")); //false. "x"패턴 숫자가 다름

        //수량자(quantifiers) ,
        System.out.println("xxx".matches("x{3}")); //true, x{3}: x가 3번 반복된다는것
        System.out.println("aaa".matches("a{3}")); //true, a{3}: a가 3번 반복된다는것
        System.out.println("aa".matches("a{3}")); //false
        System.out.println("aa".matches("a{1,3}")); //a{1,3} a가 한번나와도 되고 두번, 세번 나와도 된다는 뜻

        System.out.println("--------------------");
        System.out.println("dog".matches("do{1,3}g")); //바로 앞에 패턴인 o가 몇번 반복되는지를 나타냄
        System.out.println("doog".matches("do{1,3}g"));
        System.out.println("dooog".matches("do{1,3}g"));

        System.out.println("dodog".matches("do{1,3}g")); //false

        System.out.println("--------------------");
        //그룹으로 묶고 싶을때: ( )
        System.out.println("dodog".matches("(do){1,3}g")); //true
        System.out.println("dododog".matches("(do){1,3}g")); //true
        System.out.println("dog".matches("(do){1,3}g")); //true
        System.out.println("--------------------");

        //수량:
        System.out.println("dog".matches("do{1,}g")); //true 뒤에는 1개 이상으로만 하고 싶을때 {1, }라고 써주면 됨
        System.out.println("doog".matches("do{1,}g")); //true
        System.out.println("dooog".matches("do{1,}g")); //true
        System.out.println("doooog".matches("do{1,}g")); //true
        System.out.println("--------------------");

        // ? : 없거나 한 번
        System.out.println("dg".matches("do?g")); //true
        System.out.println("dog".matches("do?g")); //ture
        System.out.println("doog".matches("do?g")); // 두번 나왔으니까 false
        System.out.println("--------------------");

        // * : 0번 이상
        System.out.println("dg".matches("do*g")); //true
        System.out.println("dog".matches("do*g"));//true
        System.out.println("doog".matches("do*g"));//true
        System.out.println("dooog".matches("do*g"));//true
        System.out.println("--------------------");

        // + : 1번 이상
        System.out.println("dg".matches("do+g")); //false
        System.out.println("dog".matches("do+g"));//true
        System.out.println("doog".matches("do+g"));//true
        System.out.println("dooog".matches("do+g"));//true
        System.out.println("--------------------");

        //문자 분류(Character classes)
        System.out.println("dog".matches("d[oi]g")); //true, [oi] o거나 i면 돼서 true임
        System.out.println("dig".matches("d[oi]g")); //true, [oi] o거나 i면 돼서 true임
        System.out.println("dag".matches("d[oi]g")); //false

        System.out.println("dog".matches("d[^oi]g")); //false [^oi] o랑 i가 아닐때
        System.out.println("dig".matches("d[^oi]g")); //false [^oi] o랑 i가 아닐때
        System.out.println("dag".matches("d[^oi]g")); //true

        System.out.println("dag".matches("d[a-z]g")); //[a-z] 글자의 범위를 정할수 있음 a부터 z까지 true
        System.out.println("dbg".matches("d[a-z]g")); //[a-z] 글자의 범위를 정할수 있음 a부터 z까지 true
        System.out.println("dcg".matches("d[a-z]g")); //[a-z] 글자의 범위를 정할수 있음 a부터 z까지 true
        System.out.println("dzg".matches("d[a-z]g")); //[a-z] 글자의 범위를 정할수 있음 a부터 z까지 true

        System.out.println("dag".matches("d[a-cx-z]g")); //abc, xyz만 올수 있음 true
        System.out.println("ddg".matches("d[a-cx-z]g")); //abc, xyz만 올수 있음 false
        System.out.println("deg".matches("d[a-cx-z]g")); //abc, xyz만 올수 있음 false
        System.out.println("dyg".matches("d[a-cx-z]g")); //abc, xyz만 올수 있음 true

        //문자 분류 기호 [0-9]는 \d와 같다. 그런데 따옴표 안에 쓸거면 역슬래쉬 한번 더 써야함
        System.out.println("0".matches("[0-9]")); //true
        System.out.println("7".matches("[0-9]")); //true
        System.out.println("0".matches("\\d")); //큰 따옴표 안에 역슬래쉬 쓸거면 역슬래쉬 한번 더 써야함 //true
        System.out.println("7".matches("\\d")); //true
        System.out.println("---------------");

        //[a-zA-z_0-9] 는 \w와 같다.
        System.out.println("a".matches("[a-zA-z_0-9]"));
        System.out.println("_".matches("\\w"));
        System.out.println("8".matches("\\w"));
        System.out.println("---------------");

        //예제: 자바 변수명 작성규칙
        // 숫자로 시작하면 안되고, 영문대소문자, _, $로만 시작할 수 있음. 숫자는 앞에만 안나오면 쓸수 있음
        String pattern = "[a-zA-Z_$][a-zA-Z_$0-9]*";
        System.out.println("pattern_1".matches(pattern)); //true
        System.out.println("_".matches(pattern)); //true
        System.out.println("$".matches(pattern)); //true
        System.out.println("4".matches(pattern)); //앞에는 숫자 못오도록 했기떄문에 false
        System.out.println("--------------");

        //전화번호 패턴
        //  010 -9999-9999
        //02-99999-9999
        //02-999-9999
        //01099999999
        //021234578
        //021235678
        // 앞에 숫자 2~3개로 시작하고, 중간도 3~4자리, 마지막 4자리가 오도록 , -기호 중간에 있어도 되고 없어도 되도록 만들기
        String pattern2 = "\\d{2,3}-?\\d{3,4}-?\\d{4}";
        System.out.println("010-9999-9999".matches(pattern2));
        System.out.println("02-9999-9999".matches(pattern2));
        System.out.println("02-999-9999".matches(pattern2));
        System.out.println("01099999999".matches(pattern2));
        System.out.println("0212345678".matches(pattern2));
        System.out.println("021235678".matches(pattern2));
        System.out.println("--------------");

        //모든 문자: .(온점)
        System.out.println("".matches("."));
        System.out.println("a".matches("."));
        System.out.println("3".matches("."));
        System.out.println("+".matches("."));

        // . : \.
        System.out.println("".matches("\\.")); //따옴표 안이라서 \\두번 . false
        System.out.println("a".matches(".")); //false
        System.out.println("3".matches(".")); //false
        System.out.println("+".matches(".")); //false
        System.out.println(".".matches(".")); //true
        System.out.println("--------------");


        //이메일 패턴
        //영문소문자, 숫자가 여러개 , @나오고  영문소문자, 숫자 여러개 .(점) 한번 나오고  영문소문자, 숫자 여러개 나오도록
        //john23@google3.com2 이 가능하도록

        //내가 잘못 쓴 것
//        String pattern3 = "\\w{1,}@\\w{1,}.\\w{1,}";
//        System.out.println("john23@google3.com2".matches(pattern3));
//        System.out.println("Ye@google.com".matches(pattern3));

        String pattern4 = "[a-z0-9]+@[a-z0-9]+\\.[a-z0-9]+"; // + 1번이상이란 뜻이여서 마지막에도 붙여야됨
        System.out.println("john23@google3.com2".matches(pattern4)); //true
        System.out.println("ye@google.com".matches(pattern4)); //true
        System.out.println("YE@google.com".matches(pattern4)); //false

        // or : |(pipe기호 또는 or기호 또는 vertical bar 라고 함.)
        System.out.println("auefhdogsod".matches(".*dog.*"));
        System.out.println("832catgsod".matches(".*cat.*"));

        System.out.println("auefhdogsod".matches(".*dog|cat.*")); //아무캐릭터가 0개이상 . 중간에 도그, 캣이 있기만 하면된다.
        System.out.println("832catgsod".matches(".*dog|cat.*"));



    }
}
