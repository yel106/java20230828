package inflearn.ch_05;

public class _04_MultiArrayLoop {

    public static void main(String[] args) {
        //다차원 배열 순회
        String [][] seats = new String [][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i=0; i< 3; i++) { //3은 세로크기를 말함.
            for (int j = 0; j < 5; j++) {    //fori라고 치면 for문 나옴. 5는 가로크기를 말함
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------");

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"},

        };

//        System.out.println(seats2[0].length);
        System.out.println(seats2.length);  //세로의 길이를 말함.



        for (int i=0; i< seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " "); //seats2[i].length라고 적어줘야 0행에 있는 A1, A2, A3까지 출력됨
            }
            System.out.println();
        }


        System.out.println("-------------------------");


        //세로 크기 10 X 가로크기 15에 해당하는 영화관 좌석
        String [][] seats3 = new String[10][15]; //선언만 할떄는 크기 지정해줘야함
        String[] eng = {"A", "B", "C", "D", "E",  "F", "G", "H", "I", "J"};

        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length; j++) { //가로. j < seats[i].length 각각 줄의 길이에 해당하는 만큼
                seats3[i][j] = eng[i] + (j + 1);
//                System.out.println(seats3[i][j] = eng[i] + (j + 1));

            }

        }

        //표 구매
        seats3[7][8] = "__"; //H9
        seats3[7][9] = "___"; //H10


        //영화관 좌석 번호 확인
        for (int i=0; i< seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " "); //seats2[i].length라고 적어줘야 0행에 있는 A1, A2, A3까지 출력됨
            }
            System.out.println();
        }

        //별 찍기 해보기
        int i;
        int k;

        for (i = 0; i < 7; i++) {
            for (k = 0; k < 7; k++) {
              if(i==0 || i==6 || k==3)   {
                  System.out.print("*");
            }
                System.out.println("");
            }




        }




        }

    }

