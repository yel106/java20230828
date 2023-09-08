package LeetCode;

import java.util.*;

public class Num1046 {
    public int lastStoneWeight(int[] stones) {




//        List<Integer> list = new ArrayList<>();
//
//
//        //정렬해서 가장 큰거 두개 뽑기
//        for(int stone : stones) {
//            list.add(stone); //추가
//            Collections.sort(list); //정렬
//        }
//
//        for(int stone: stones) {
//            int max1= 0;
//            int max2= 0;
//            if(list.size() > 0) {
//                max1 = list.get(0);
//                max2 = list.get(1);
//            }
//            int removal= max1- max2;
//            list.remove(removal);
//
//        }
//        if( stones.length ==1) {
//
//        }
//
//        return 0;
//
//        //list
//        //sort, remove, add, get, size 어떻게 참고하는지는 api 보기






        //sort, remove, add 반복. size가 1이 될때까지
        List<Integer> list = new ArrayList<>();
        // list
        // sort, remove, add, size

        // [2, 7, 4, 1, 8, 1]

        // 1.sort
        // [8, 7, 4, 2, 1, 1]

        // 2.remove
        // [4, 2, 1, 1]

        // 3.add
        // [4, 2, 1, 1, 1]

        // 1.sort
        // [4, 2, 1, 1, 1]

        // 2.remove
        // [1, 1, 1]

        // 3.add
        // [1, 1, 1, 2]

        // 1.sort
        // [2, 1, 1, 1]

        // 2.remove
        // [1, 1]

        // 3.add
        // [1, 1, 1]

        // 1.sort
        // [1, 1, 1]

        // 2.remove
        // [1]

        // 3.add
        // [1]



        //정렬해서 가장 큰거 두개 뽑기
        for (int stone : stones) {
            list.add(stone); //추가
            Collections.sort(list); //정렬
        }

        while (list.size() > 1) {
            //사이즈가 1보다 큰 동안은 sort, remove, add반복하기
            //1. sort. 컴퓨터는 오 왼 비교해서 하기때문에 순서가 중요함. 두개비교하는게 compare메소드.
            // 큰수가 오른쪽에 가도록 compare(8,4) 오른쪽이 크다고 할거면 양수를 리턴해야함.
            // compare(4, 8) : 이떈 음수가 나와야 8이 오른쪽으로 감
            //compare(5, 5) 같으면 0을 리턴
//            list.sort(new Comparator<Integer>() {
//                @Override
//                public int compare(Integer o1, Integer o2) {
//                    return o1 = o2;
//                }
//            });
            //위 코드를 람다로 간단하게 한것
            list.sort((o1, o2) -> o2 - o1);  //오른쪽에 와야될게 더 커야하니까 o2- o1을 해야함

            //2.remove
            int stone1 = list.remove(0); //맨 앞에 있는거 삭제해서 반복
            int stone2 = list.remove(0); //앞에꺼가 지워지면 뒤에꺼가 0번이 되니까

            //3. add
            int diff = stone1 - stone2;
            if (diff > 0) {
                list.add(diff);
            }
        }

        if (list.size() == 1) {
            return list.get(0);
        }
        return  0;
    }
}
