package Inflean.chap_10;



public class _02_AnonymousClass2 {
    public static void main(String[] args) {
//아래와 같이 써도 되지만 별도의 메소드를 만들어서 처리할것
//        HomeMadeBurger momMadeBurger = new HomeMadeBurger() {
//            @Override
//            public void cook() {
//
//            }
//        };

     HomeMadeBurger momMadeBurger = getMomMadeBurger(); //아래서 만든 메소드를 호출함
     momMadeBurger.cook();
     System.out.println("-----------");

     HomeMadeBurger broMadeBurger = getBroMadeBurger();
     broMadeBurger.cook();

    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료: 빵, 치킨패티, 양배추 샐러드, 딸기쨈");
            }
        };


    }

    public static HomeMadeBurger getMomMadeBurger() { //메소드의 반환값에 HomeMadeBurger가 옴. getMomMadeBurger는 메소드명
        //HomeMadeBurger를 반환해야하니까 return을 써야함


        return new HomeMadeBurger() { //메소드를 통해 새로운 익명 클래스 객체를 반환함
            @Override
            public void cook() {
                //cook 추상 메소드는 클래스를 따로 만들지 않고 익명클래스를 통해
                // 자식이 부모클래스를 상속받아 사용하는 것과 똑같이 사용됨
                System.out.println("집에서 만드는 엄마표 수제 버거");
                System.out.println("재료: 빵, 소고기패티, 해쉬브라운, 치즈, 양상추");
            }
        };
    }
}


//추상메소드는 상속받은 자식의 객체를 만들어야 사용가능
//그런데 한번만 사용할거면 상속받는 클래스를 또 만들긴 번거로우니까
//익명클래스를 사용
abstract class HomeMadeBurger {
    public abstract void cook();
}