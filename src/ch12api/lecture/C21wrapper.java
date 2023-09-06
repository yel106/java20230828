package ch12api.lecture;

public class C21wrapper {
    public static void main(String[] args) {
        int i =3;
        Integer j= Integer.valueOf(i);
        Object k = j;

        int l = 5;
        Integer m = l;
        Object n = m;

        Object o = 7;


//        int p = o; //x
        Integer q = (Integer) o; //위험한 코드!
        int r= q;

        int s = 30; //4byte
        long t = s;  //8 byte  4바이트를 8로 바꾸는건 됨

        Integer u = 300;
//        Long v = u; //왜 Integer를 Long에 넣는건 안될까?  다형성 떄문. 인티저는 넘버, 오브젝트도 되는데 Long이 된다는 근거가 api에 없음

        float w = 3.14f;
        double x = w; //기본타입 float는 double에 들어감

//        Floate y = 3.14f;
//        Double z = y; //x //참조타입 Floate는 Double에 들어가지 못함. 기본형이랑 저장방식이 달라서 못들어감





    }
}
