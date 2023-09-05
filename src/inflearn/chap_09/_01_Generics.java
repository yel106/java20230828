package inflearn.chap_09;

public class _01_Generics {
    public static void main(String[] args) {




//        제네릭스: 똑같은 동작을 하는 클래스나 메소드를 여러번 만들 필요없이 한번만 만들고
//        여러타입을 지원함

        // 제네릭스는 객체만 지원하는데 int, double은객체가 아니기 떄문에 사용할 수 없어서 래퍼클래스로 바꿔야함
//        int[] iArray = {1, 2, 3, 4, 5};
//        double[] dArray= {1.0, 2.0, 3.0, 4.0, 5.0};
//        String [] sArray ={"A", "B", "C", "D", "E"};


        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray= {1.0, 2.0, 3.0, 4.0, 5.0};
        String [] sArray ={"A", "B", "C", "D", "E"};

//        printIntArray(iArray); //정수형 배열을 넣을것
//        printDoubleArray(dArray);
//        printStringArray(sArray);

        System.out.println("---------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    //T: Type,
    private static <T> void printAnyArray(T[] array) {
        for(T t: array) {
            System.out.println(t + "");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for(String s: sArray) {    //타입 변수명: 돌릴객체(배열 등)
            System.out.print(s+ "");
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] dArray) {
            for(double d: dArray) {    //타입 변수명: 돌릴객체(배열 등)
                System.out.print(d + "");
            }
        System.out.println();
    }

    //Alt +enter 치면 자동으로 메소드만듦
    private static void printIntArray(int[] iArray) {
        for(int i: iArray) {    //타입 변수명: 돌릴객체(배열 등)
            System.out.print(i + "");
        }
    }

}
