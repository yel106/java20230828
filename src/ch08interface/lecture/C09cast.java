package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.lang.constant.ConstantDescs;

public class C09cast {
    public static void main(String[] args) {
        CharSequence c = "java";

        String s = (String) c;
        Object ce = (Object) c;
        Serializable se = (Serializable) c;
        Comparable  co = (Comparable) c;
        Constable con = (Constable) c;
        ConstantDesc cd = (ConstantDesc) c;

//        Number n = (Number) c; //문법 오류는 아니지만 실행하는 동안 오류가 뜸 . 안전하게 바꿀수 있는지 확인하는게 instaceof



        System.out.println("프로그램 종료");

    }
}
