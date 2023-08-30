/*
package ch07extends.lecture;


public class C20polymorphism {
    public static void main(String[] args) {

        Item item = getItem();
        item.printDesc();

        Item item1 = getItem();
        item1.printDesc();

        System.out.println("게임 종료...");
    }

    private static Item getItem() { // 아이템 클래스를 반환하는 getItem 메서드를 만들겠다.
        double d = Math.random(); //0~1 미만의 난수 생성

        if (d < 0.5) {
            return new Potion(); //item객체를 potion의 객체로 만들겠다.
        } else {
            return new Map();
        }
    }
}

class Item {
    public void printDesc() {
        System.out.println("아이템입니다.");
    }
}

class Potion extends Item {
    @Override
    public void printDesc() {
        System.out.println("체력을 채워줍니다.");
    }
}

class Map extends Item {
    @Override
    public void printDesc() {
        System.out.println("지도를 확장해줍니다.");
    }
}
*/
package ch07extends.lecture;

public class C20polymorphism {
    public static void main(String[] args) {



    }

    public static Item getItem() {

    }


}

class Item {
    public void printDesc() {
        System.out.println("아이템입니다.");
    }
}

class Potion extends Item {
    @Override
    public void printDesc() {
        System.out.println("체력을 채워줍니다.");
    }
}

class Map extends Item {
    @Override
    public void printDesc() {
        System.out.println("지도를 확장해줍니다.");
    }
}






















