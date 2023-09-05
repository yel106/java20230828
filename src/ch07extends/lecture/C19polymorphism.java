/*
package ch07extends.lecture;

public class C19polymorphism {
    public static void main(String[] args) {
        Hero19 myHero = new Hero19();
        myHero.weapon = new Gun();
        myHero.attack();

        myHero.weapon = new Sword();
        myHero.attack();
    }
}

class Hero19 {
    public Weapon weapon;

    public void attack() {
        weapon.shot();
    }

}

class Weapon {
    public void shot() {
        System.out.println("무기를 사용합니다.");
    }
}

class Gun extends Weapon {
    @Override
    public void shot() {
        System.out.println("총을 쏩니다.");
    }
}

class Sword extends Weapon {
    @Override
    public void shot() {
        System.out.println("검을 휘두릅니다.");
    }

}
*/

package ch07extends.lecture;

public class C19polymorphism {
    public static void main(String[] args) {
        Hero19 myHero = new Hero19();
        myHero.attack();

    }
}

class Hero19 {
    public Weapon weapon;

    public void attack() {
        weapon.shot(); //Weapon의 객체를 선언하고 , 그 객체의 메소드를 호출
    }

}

class Weapon {
    public void shot() {
        System.out.println("무기를 사용합니다.");
    }
}

class Gun extends Weapon {
    @Override
    public void shot() {
        System.out.println("총을 쏩니다.");
    }
}

class Sword extends Weapon {
    @Override
    public void shot() {
        System.out.println("검을 휘두릅니다.");
    }

}

