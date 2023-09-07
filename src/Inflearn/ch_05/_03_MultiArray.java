package inflearn.ch_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        //다차원 배열 ( 2차원 배열)
        //소규모 영화관 좌석
        //A1 - A5
        //B1- B5
        //C1 -C5

        String [] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String [] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String [] seatC = {"C1", "C2", "C3", "C4", "C5"};

//         3(세로) X 5(가로) 크기의 2차원 배열: [][] 두개 사용 {}, {},{} 로 구분
        String [][] seats = new String [][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

//        B2에 접근하려면?  [][]
//        첫번째 괄호 안에는 세로. 몇번째 인덱스인지를 나타냄 A1, B1, C1
//        0부터 숫자세는 것
        System.out.println(seats[1][1]);

//        C5에 접근하려면?
        System.out.println(seats[2][4]);

        // 첫줄에는 3칸, 둘쨰줄은 4칸, 셋쨰 줄은 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        //A3에 접근하려면?
        System.out.println(seats2[0][2]);

        //A5에 접근할수 있을까?
//        System.out.println(seats2[0][4]); //배열의 범위를 넘어선다는 오류가 뜸. 인덱스값이 잘못 처리된 것.

        //3차원 배열 만들기 (세로 X 가로 X 높이 > 실무에서는 잘 사용안함
        String[][][ ] marray = new String[][][] {
                { {}, {}, {}, {} },   //1차원 배열을 둘러싼 2차원 배열을 써주면 됨
                { {}, {}, {}, {} },
                { {}, {}, {}, {} }
        };



    }
}
