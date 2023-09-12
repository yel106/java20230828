package ch11exception.lecture;

public class C10catch {
    public static void main(String[] args) {
        try {
            //exception 발생 가능 코드
        } catch (ArrayIndexOutOfBoundsException e) {
            //exception 처리 코드
        }catch (NumberFormatException e) {
            //exception 처리 코드
        }

        //같은것을 여러번 쓰는게 싫다면?
        // catch block이 중복된 코드를 가지고 있다면  |를 이용하면 됨

        try {

        } catch (NullPointerException | ClassCastException e) {

        }





    }
}
