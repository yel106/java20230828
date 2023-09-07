package Study.Restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Menu> select = new ArrayList<>();
        select.add(new Menu("김밥",3000, "야채김밥, 치즈김밥"));
        select.add(new Menu("떡볶이", 4000, "쌀떡/밀떡 선택"));
        select.add(new Menu("라면", 4500, "라면/ 치즈라면/ 떡라면"));

        //???안나옴 foreach
//        for (Menu s : select
//             ) {
//            if()) {
//                System.out.println();
//            }
//            }

            
        }
//        if(select.contains("김밥")) {
//            System.out.println("주문 성공하셨습니다.");
//        }

                //따로는 안되나?
//        ArrayList<String> select2 = new ArrayList<>();
//        select2.add("");








    }




class Menu {
    public String menu;
    public int price;
    public String ex;

    public Menu(String menu, int price, String ex) {
        this.menu = menu;
        this.price = price;
        this.ex = ex;
    }
}